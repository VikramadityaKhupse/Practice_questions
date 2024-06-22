import PyPDF2
import re

pattern = "2022BCS\d+"
f = open("backlog_students_list.pdf", 'rb')  # read binary
pdf_reader = PyPDF2.PdfReader(f)
for page in pdf_reader.pages:
    length = len(re.findall(pattern, page.extract_text()))
    if length != 0:
        print(length)
