# tutorial em https://felipenoris.github.io/XLSX.jl/v0.3/

using Pkg               # Usando Pacotes

Pkg.add("XLSX")         # Adincionando pacotes XLSX
import XLSX             # Importando pacotes XLSX     # Adicionando Pacotes XLSX para planilhas
Pkg.add("DataFrames")   # Adicionando pacotes Data Frames
import DataFrames       # Importando Data Frames
using DataFrames, XLSX  # Utilizando DataFrames com XLSX
Pkg.add("Plots")        # Adicionando pacotes que Plota gráfico
import Plots            # Importando Plots
using Plots; gr()

planilha = XLSX.readxlsx("/home/linuxlite/Workspaces/Shell Projects/Autorais/Logger para aula de estatistica/Registro.xlsx")
 # variavel criada 'planilha' > Acessando a Planilha no path
display(XLSX.sheetnames(planilha))      # Mostra as Abas contidas na planilha
println(XLSX.sheetnames(planilha))      # Mostra as Abas contidas na planilha

mostrarRegistro = planilha["Registro"]   # variavel criada 'mostrarRegistro' > Define qual aba será usada

display(mostrarRegistro["A1"])           # na ABA tratamento de dados mostra cédula B5
display(mostrarRegistro["A1:G1"])
display(mostrarRegistro["A3:H3"])
display(XLSX.readdata("/home/linuxlite/Workspaces/Shell Projects/Autorais/Logger para aula de estatistica/Registro.xlsx", "Registro", "A4:G4"))  # Apenas uma linha com tudo acima feito
display(mostrarRegistro[:])           # Mostra todo conteúdo da planilha quando existe uma dimensão definida
display(planilha["Registro!C3:D3"])   # Outra maneira de achar um resultado na planilha e printar
display(planilha["Registro"])
display(planilha["Registro!B:H"])  # Mostra conteúdo das cédulas de 'B' a 'H'

planilhaDataFrame = DataFrame(XLSX.readtable("/home/linuxlite/Workspaces/Shell Projects/Autorais/Logger para aula de estatistica/Registro.xlsx","Registro"))
println(planilhaDataFrame)

mostrarRegistro = planilha["Registro"]

display(histogram(randn(10), nbins=100))
display(histogram(mostrarRegistro["A2:A34"],mostrarRegistro["G2:G34"]))
display(mostrarRegistro["A2:A34"])
atividade = mostrarRegistro["A2:A34"]
dia = mostrarRegistro["G2:G34"]
display(histogram(atividade, dia))

println(typeof(atividade))
