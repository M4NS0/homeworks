### Ajusting Development Enviroment for JavaScript Development

1. Open module 4 folder in IDE
   1. Open project folder with favorite IDE or open a terminal in project's path and type:
```sh
    $ sublime .
```
2. In same project's path, start Live Serveror browser sync:

```sh
    $ browser-sync start --server --directory --files "**/*"
```
```sh
    $ live-server
```

<br>
<br>
<br>

###### Where to include Javascript 

```html <!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">

    <!----------------->
    <script src="js/script.js"></script>
    <!----------------->
    <script>
        console.log(x);
    </script>
    <!----------------->
</head>

<body>
    <h1>Lecture 40</h1>

    <!----------------->
    <script></script>
    <!----------------->
    <script src="js/script.js"></script>
    <!----------------->

</body>
</html>
```
