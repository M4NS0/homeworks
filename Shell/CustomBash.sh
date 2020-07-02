# instale o geoiplookup e o nmap para rodar esse script
# sudo apt install geoip-bin -y  && sudo apt-get install geoip-database && sudo apt-get install geoip-database-extra && sudo apt-get install nmap


# Linux Lite Custom Terminal

LLVER=$(awk '{print}' /etc/llver)

# cria variável de ip e cidade
MEUIP=`host myip.opendns.com resolver1.opendns.com | grep "myip.opendns.com has" | awk '{print $4}'`
IP=`echo $MEUIP | cut -d '{' -f1`

CITY=`geoiplookup $IP | grep City | cut -d : -f2`
CIDADE=`echo $CITY | cut -d , -f 4`


UP=`uptime -p | cut -c4-30`
USERS=`uptime | cut -c22-27`
NAREDE=`nmap -n -sn 192.168.25.225/24 -oG - | awk '/Up$/{print $2}'`

echo ""
echo -e "  Bem vindo ao Terminal"
echo ""


hostnamectl | grep -i "operating system"
free -m | awk 'NR==2{printf "      Memory Usage: %s/%sMB (%.2f%%)\n", $3,$2,$3*100/$2 }'
df -h | awk '$NF=="/"{printf "        Disk Usage: %d/%dGB (%s)\n", $3,$2,$5}'
echo -e "            Distro: $LLVER"
hostnamectl | grep -i "kernel"
echo -e "                IP: $MEUIP"
echo -e "            Uptime: $UP"
echo -e "             Users: $USERS"
echo -e ""
echo -e "Wireless Users:"
echo -e "$NAREDE"

echo ""

echo $CIDADE","

date "+%A %d %B %Y, %T"


# echo "Support - https://www.linuxliteos.com/forums/ (Right click, Open Link)"
echo " "

