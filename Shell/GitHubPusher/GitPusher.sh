#!/bin/sh

repName=$(echo "Workspaces,Matriz.Curricular,Projetos,M4NS0.github.io")
crud=$(echo "Create,Update,Delete")
yad --width 500 --height 200 --title="GitAutoPusher" \
--image marca.png \
--form --separator="," \
--item-separator="," \
--field="Repositório:CB" \
--field="CRUD:CBE" \
--field="\n\nSe deseja adicionar algum comentário adicional, escreva abaixo::TXT" \
"$repName" "$crud" "" > ~/$USR/.cache/config

NAME=`cat config | awk -F',' '{print $1}'`
CRUD=`cat config | awk -F',' '{print $2}'`
COMMENT=`cat config | awk -F',' '{print $3}'`

cd ~/$USR/$NAME
git add .
git commit -m "$CRUD  $COMMENT"
git push
exit

