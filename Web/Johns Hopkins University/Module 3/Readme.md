### Module 3

####  David Chu's China Bistro Site Development

<img src="page.png" width="60%" height="auto" />

<br>
<br>
<br>


###### Contents:

|Subject                                        |Lecture  |
|-----------------------------------------------|---------|
|Intro                                          |27-29    |
|Coding the Navigation Bar of the Site          |30-33    |
|Coding the Home Page and The Footer            |34-36    |
|Coding Restaurant Menu Pages                   |37-39    |

<br>
<br>
<br>

> **Attention:**
> 
> Immutable folders are inside the  root  path (*Module 3/*).
Mutable folders are inside the lecture path.
Mutable folders are always receiving updates 
through lectures. Paths inside html files are 
redirected to both, root and lecture folders.
>
>It's some kind of wrong practice but the idea 
is to avoid  overwriting  earlier  modifications 
showing up the steps of a  Web  Site Development 
> 
> For further usage and implementations, place all folders 
(/css, /js /images /fonts)  and the html files inside the same  directory 
> 
> The same rule applies to image paths inside style.css file
> 
> Exemples:
> <br>

```html 

    <link rel="stylesheet" href="../css/bootstrap.min.css">
    <link rel="stylesheet" href="css/styles.css">

    <script src="../js/jquery-2.1.4.min.js"></script>
    <script src="../js/bootstrap.min.js"></script>
    <script src="js/script.js"></script>
```

```css 
    background: url('../images/restaurant-logo_large.png') no-repeat;
```

> <br>
> 
> *Double Dots and a Slash means that the folder 
location is in the root path, so they are unmutable folders that contains Bootstrap files or the project images*
> *No Dots and Slash means that the folder sits inside 
the same Lecture Folder, and they are mutable folders that recieves continuously updates.*
> The mutable files are: *js/script.js*, *css/style.css* and all *.html* files.
>
> <br>

<br>

