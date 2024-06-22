import smtplib
import getpass
from email.message import EmailMessage

# establishing connection
smtp_object = smtplib.SMTP('smtp.gmail.com', 587)
smtp_object.ehlo()
smtp_object.starttls()

# taking email and pass inputs
email = getpass.getpass("Enter your email: ")
password = getpass.getpass("Enter your password: ")

# logging in
smtp_object.login(str(email), str(password))

# taking email from and to etc. inputs
email_from = email
email_to = email
subject = input("Enter subject of the email: ")
message_body = input("Enter message body of the email: ")

# Create the email message
msg = EmailMessage()
msg.set_content(message_body)
msg['Subject'] = subject
msg['From'] = email_from
msg['To'] = email_to
smtp_object.send_message(from_addr=email_from, to_addrs=email_to, msg=msg)
smtp_object.quit()
