import os


# Creating seperate folder of each website we crawl
def create_project_dir(directory):
    if not os.path.exists(directory):
        print('Creating Project'+ directory)
        os.makedirs(directory)

# Create a queue and crawled files(if not created)
def create_data_files(project_name, base_url):
    queue = project_name + '/queue.txt'
    crawled = project_name + '/crawled.txt'
    if not os.path.isfile(queue):
        write_file(queue, base_url)
    if not os.path.isfile(crawled):
        write_file(crawled, '')


# Create a new file
def write_file(path, data):
    f = open(path, 'w')
    f.write(data)
    f.close()


# Add data onto the exiting file
def append_to_file(path, data):
    with open(path, 'a') as file :
        file.write(data + '\n')


# Delete the content of the file
def delete_file_content(path):
    open(path, 'w').close()


# Read each line and convert each line to the set
def file_to_set(file_name):
    results = set()
    with open(file_name, 'rt') as f:
        for line in f:
            results.add(line.replace('\n',''))
    return results


# Read a set and add each new line to the file
def set_to_file(links, file_name):
    with open(file_name,"w") as f:
        for l in sorted(links):
            f.write(l+"\n")