from HTMLParser import HTMLParser
from urlparse2 import urlparse2


class LinkFinder(HTMLParser):

    def __init__(self, base_url, page_url):
        super(LinkFinder,self).__init__()
        self.base_url = base_url
        self.page_url = page_url
        self.links = set()

    def handle_starttag(self, tag, attrs):
        if tag == 'a':
            for(attribute, value) in attrs:
                if attribute == 'href':
                    url = urlparse2.urljoin(self.base_url, value)
                    self.links.add(url)

    def page_links(self):
        return self.links

    def error(self, message):
        pass

