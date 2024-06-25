import os
import shutil

print(os.cpu_count())
print(os.EX_SOFTWARE)
print(os.getcwd())
print(os.getlogin())
print(shutil.disk_usage('/home'))
print(os.walk(top=os.getcwd()))
