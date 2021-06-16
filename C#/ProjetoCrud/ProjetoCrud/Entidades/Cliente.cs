using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ProjetoCrud.Entidades
{
    class Cliente {
        int id;
        String nome, sexo;
        DateTime nascimento;

        public int Id { get => id; set => id = value; }
        public string Nome { get => nome; set => nome = value; }
        public string Sexo { get => sexo; set => sexo = value; }
        public DateTime Nascimento { get => nascimento; set => nascimento = value; }
    }
}
