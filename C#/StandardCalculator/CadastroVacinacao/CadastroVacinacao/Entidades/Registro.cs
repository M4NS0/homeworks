using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CadastroVacinacao.Entidades
{
    class Registro
    {
        int id, idVacina;
        String nome, dataVacinacao;

        public int Id { get => id; set => id = value; }
        public int IdVacina { get => idVacina; set => idVacina = value; }
        public string Nome { get => nome; set => nome = value; }
        public string DataVacinacao { get => dataVacinacao; set => dataVacinacao = value; }
    }


}
