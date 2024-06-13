import tabula

df = tabula.read_pdf("backlog_students_2023-24.pdf", pages='all')[0]
tabula.convert_into("backlog_students_2023-24.pdf", "backlog_students_2023-24.csv", output_format="csv", pages='all')
print(df)