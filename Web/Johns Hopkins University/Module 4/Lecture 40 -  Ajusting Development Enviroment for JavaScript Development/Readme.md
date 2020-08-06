### Ajusting Development Enviroment for JavaScript Development

[Link to Lesson - Part 1](https://www.coursera.org/learn/html-css-javascript-for-web-developers/lecture/VN6fv/lecture-40-part-1-adjusting-development-environment-for-javascript-development)

[Link to Lesson - Part 2](https://www.coursera.org/learn/html-css-javascript-for-web-developers/lecture/okSX6/lecture-40-part-2-where-to-place-javascript-code)

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

```html 
    <!DOCTYPE html>
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
