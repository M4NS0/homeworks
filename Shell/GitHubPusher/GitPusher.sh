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
"$repName" "$crud" "" > temp

NAME=`cat temp | awk -F',' '{print $1}'`
CRUD=`cat temp | awk -F',' '{print $2}'`
COMMENT=`cat temp | awk -F',' '{print $3}'`

cd ~/$USR/$NAME
git add .
echo
git remote get-url origin
echo
git commit -m "$CRUD  $COMMENT"
echo
git push
exit

