

<img src="bootstrap.png" width="100%" height="auto" />


- JS Frameworks
- Mostly CSS classes
- Mobile First
    - Plan Mobile from Start
    - CSS Framework is mobile ready 
<br>


###### Disadvantages 
###### Bootstrap vs. Writing Your Own

<br>

> Complaint:
> - Too big, too bloated (*inchado*)
>
>- Lots of features will never be used
>   - Selective download and only download what will be used
>- Write yours own, a smaller/targeted version
>   - It will take a lot longer to write is as well


<br>
<br>


###### Starting Bootstrap

<br>

>1. Downlad bootstrap and place JS and CSS folders inside project   [ *download* ](https://github.com/twbs/bootstrap/releases/download)
>
>
>2. Create a file jquery.js into JS folder and paste contents below inside of it [ *download* ](https://jquery.com/download/)
>3. Create a Style.css and a Script.js and place inside the folders
>
> *Use the following lines, below:*

```html
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Bootstrap Starter Page</title>

        <link rel="stylesheet" href="css/bootstrap.min.css">
        <link rel="stylesheet" href="css/styles.css">
    </head>

    <body>
        <script src="js/jquery-3.5.1.js"></script>
        <script src="js/bootstrap.bundle.js"></script>
        <script src="js/script.js"></script>
    </body>
```
>*Bootstrap stylesheet must be on top, so styles.css can override  preferences*
>
>*Attention to the order of scripts also*
