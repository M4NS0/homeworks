folderName= basename ~+


URL='https://cdn.leadfortaleza.com.br/videos/lsc/libras'
newfilepath="$URL"/"$( basename ~+)/"

echo "${newfilepath}"
echo "${intentname}"

ls -ltR |awk '{printf $9 "\n"}'

