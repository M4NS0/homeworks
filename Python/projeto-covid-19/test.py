import csv
import getHeaders

with open("data.csv", "r") as source:
    reader = csv.reader(source, delimiter=';')

    headers = getHeaders.headers

    with open("data-reduce.csv", "w") as result:
        writer = csv.writer(result)

        for r in reader:
            writer.writerow((r[headers.index('DT_NOTIFIC')], r[headers.index('CS_SEXO')],
                             r[headers.index('ID_PAIS')], r[headers.index('PUERPERA')],
                             r[headers.index('FATOR_RISC')], r[headers.index('CARDIOPATI')],
                             r[headers.index('HEMATOLOGI')], r[headers.index('SIND_DOWN')],
                             r[headers.index('HEPATICA')], r[headers.index('ASMA')],
                             r[headers.index('DIABETES')], r[headers.index('NEUROLOGIC')],
                             r[headers.index('PNEUMOPATI')], r[headers.index('IMUNODEPRE')],
                             r[headers.index('RENAL')], r[headers.index('OBESIDADE')],
                             r[headers.index('OBES_IMC')], r[headers.index('OUT_MORBI')],
                             r[headers.index('HOSPITAL')], r[headers.index('UTI')],
                             r[headers.index('SUPORT_VEN')], r[headers.index('CLASSI_FIN')],
                             r[headers.index('EVOLUCAO')]))

print(reader.line_num)
## conversion.csv_to_json("data-reduce.csv", "data.json")
