### Pseudo-Class Selectors

- Based on user interaction with the page
- Adress targets that can't be targeting
#
###### Syntax:
```sh
    selector:pseudo-class {
        ...
    }
```
#
###### Pseudo-class :link
- *Link itself*
- *Selects all unvisited links*
#
###### Pseudo-class :visited
- *Selects all visited links*
###### Pseudo-class :hover
- *Selects links on mouse over*
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

###### Pseudo-class :active
- *Pressed the mouse button down but hasn't released yet*
#

###### Pseudo-class :nth-child
- *Selects every <p> element that is the second child of its parent*
#





###### Whole Pseudo-classes:
<img src="https://github.com/M4NS0/Workspaces/blob/master/Web/Johns%20Hopkins%20University/Module%202/Lecture%2015%20-%20Pseudo-Class%20Selectors/pseudo-classes.png" width="80%" height="auto" />