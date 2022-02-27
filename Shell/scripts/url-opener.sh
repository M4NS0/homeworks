while read line; 
do 
    google-chrome "$line"
    sleep 1
done < url-para-intents-test.txt
