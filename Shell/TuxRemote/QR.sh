sudo apt install openssh-server
ssh localhost
hostname -I


#telnet
sudo apt install telnetd -y
sudo systemctl status inetd

# grep do ip da maquina inet
# grep do username da maquina

sudo ufw allow 23/tcp
sudo ufw reload


(sleep 3;echo usuario;sleep 3;echo senha;sleep 3;echo comando;sleep 3;) | telnet inet 23

