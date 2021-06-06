using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CadastroVacinacao.Entidades
{
    class Vacina
    {
        int id;
        String nome, fabricante, dose, origem;

        public int Id { get => id; set => id = value; }
        public string Nome { get => nome; set => nome = value; }
        public string Fabricante { get => fabricante; set => fabricante = value; }
        public string Dose { get => dose; set => dose = value; }
        public string Origem { get => origem; set => origem = value; }
    }

}
