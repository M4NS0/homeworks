### Pseudo-Class Selectors

- Can be very powerful
- Based on user interaction with the page
- Adress targets that can't be targeting
- Make sure your selector is still readable
- Simple/Readable > Complicated/Tricky
#
###### Syntax:
```css
    selector:pseudo-class {
        ...
    }
```
#
###### Pseudo-class :link, :visited

> *Link: Selects all unvisited links*
> *Visited: Selects all visited links*

```css 
    a:link,
    a:visited { 
        /* visited: diferent style can be applyed after clicking */

        text-decoration: none;
        /* removes the underline */

        background-color: blueviolet;
        border: 2px solid yellowgreen;
        color: yellowgreen;
        width: 200px;
        text-align: center;
        margin-bottom: 1px;
        
        display: block;
        /* changes inline to block element filling 
        up all the space possible within that line*/
        }

```
#
###### Pseudo-class :hover, :active
> *Hover: Selects links on mouse over*
> *Active: Pressed the mouse button down but hasn't released yet*
```css
    a:hover,
    a:active {
        background-color: green;
        color: purple;
    }

``` 
#

###### Pseudo-class :nth-child
> *Selects every 'p' element that is the second child of its parent*
> *nth-child(3) refers to the 3rd element in the List in Header*
```css
    header li:nth-child(3) {
        font-size: 20px;
    }
```
> Odd used in lists can make it way mutch readable:
```css
    section div:nth-child(odd) {
        background-color: blueviolet;
    }
```
> *Specific child can be choosen to highlight wen hovered*
> *In next exemple, when 4th element is hovered:*
```css 
    section div:nth-child(4):hover {   
        background-color: green;
        cursor: pointer;
    }

```

#



###### All Kinds of Pseudo-classes:
<img src="https://github.com/M4NS0/Workspaces/blob/master/Web/Johns%20Hopkins%20University/Module%202/Lecture%2015%20-%20Pseudo-Class%20Selectors/pseudo-classes.png" width="80%" height="auto" />