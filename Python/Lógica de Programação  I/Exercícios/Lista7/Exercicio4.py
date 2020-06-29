motoTK = 55000
motoAP = 1500
taxaTK = 0.5/100
taxaAP = 0.89/100
meses = 0;

while motoAP <= motoTK:
    motoAP = motoAP + (motoAP*taxaAP)
    motoTK = motoTK + (motoTK*taxaTK)
    meses +=1
contagemAnos = meses/12
print("Daqui a {} anos aparecida tera mais motos que tokio com {} motos".format(contagemAnos,motoAP))
