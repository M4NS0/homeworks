###### The Box Model - Part II

```css 
     *  {
        box-sizing: border-box;
        }
```
> *Star is a selector to every style emement* (*)
> *To reset browser, overriding it's default over a html page:*
```css
    *   {
        box-sizing: border-box;
        margin: 0;
        padding: 0;
        }
```

###### Cumulative* Margins
(*conurbação*)

> *Margins, bottom and top of two cumulatives* 
> *boxes, collapses and the larger margin wins*

```css
    #box {
        margin-top: 20px; /* will collapse */
         }
         
    h1  {
        margin-bottom: 30px; /* will define the distance between Title and the box */
        }

```

```css
    #box{
        margin-top: 50px; /* will define the distance between Title and the box */
        }

    h1  {
        margin-bottom: 30px; /* will collapse */
        }

```
