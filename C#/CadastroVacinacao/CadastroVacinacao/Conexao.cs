using MySql.Data.MySqlClient;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CadastroVacinacao
{
    class Conexao
    {
        String conexao =
            "SERVER = localhost;" +
            "DATABASE = bd;" +
            "UID = root;" +
            "PWD = ";
        public MySqlConnection con = null;

        public void AbrirConexao()
        {
            try
            {
                con = new MySqlConnection(conexao);
                con.Open();

            }
            catch (MySqlException e)
            {
                throw (e);
            }
        }
        public void FecharConexao()
        {
            try
            {
                con = new MySqlConnection(conexao);
                con.Close();
            }
            catch (MySqlException e)
            {
                throw (e);
            }
        }
    }
}
