#!/bin/sh

repName=$(echo "Workspaces,Matriz.Curricular,Projetos,M4ns0.github.io")
crud=$(echo "Create,Remove,Update,Delete")
yad --width 500 --height 200 --title="GitAutoPusher" \
--image marca.png \
--form --separator="," --item-separator="," \
--field="Repositório:CB" \
--field="CRUD:CBE" \
--field="\n\nSe deseja adicionar algum comentário adicional, escreva abaixo::TXT" \
"$repName" "$crud" "" > config

NAME=`cat config | awk -F',' '{print $1}'`
CRUD=`cat config | awk -F',' '{print $2}'`
COMMENT=`cat config | awk -F',' '{print $3}'`

cd ~/$USR/$NAME
git add .
git commit -m "$CRUD  $COMMENT"
git status
git push

yad --form --title "GitAutoPusher" --text="\n\n  Foi feito um $CRUD no Repositório $NAME  \n\n"  
cd ~/$USR/Workspaces/Shell/GitHub
./GitPusher.sh
