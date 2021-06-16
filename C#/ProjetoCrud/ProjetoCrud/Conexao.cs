using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using MySql.Data.MySqlClient;

namespace ProjetoCrud
{
    class Conexao
    {
        String conexao = "SERVER = localhost; DATABASE=sistema_clientes; UID=root; PWD=;";
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
