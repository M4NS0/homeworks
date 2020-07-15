### Conflict Resolution - Part 2
##

###### Specificity
> -The most specific Selector Combination Wins

###### Score:
> - Higher Score Wins the Inheritance
> 
| style="" | ID  | Class, pseudo-class,  attribute | Number of Elements | v Selectors v                     | Score     |
| -------- | --- | ------------------------------- | ------------------ | --------------------------------- | --------  |
| 1        | 0   | 0                               | 0                  | *h2 style = color:green;*         | **1000**  |
| 0        | 1   | 0                               | 1                  | *div #myParag { color: green;}*   | **101**   |
| 0        | 0   | 1                               | 2                  | *div.big p { color: green; }*     | **12**    |
| 0        | 0   | 0                               | 2                  | *div p {color:green;}*            | **2**     |

> *Exemple:*
```html
        <style>
            body {
                margin: 0 auto;
                margin-top: 50px;
                max-width: 600px;
            }
            
            header.navigation p {
                 /* style = 0, id = 0, class = 1, elements = 2 >>  Score = 12 */
                color: blueviolet;     
            } 

            p.blurb {
                 /* style = 0, id = 0, class = 1, elements = 1 Score = 11 */
                color: green;
            }

            p {
                color: green !important;
            }
        </style>
    </head>

    <body>
        <header class="navigation"> 
            <p class="blurb">   header.navigation p would win the inheritance and it will override p.blurb, but
                                !important makes it override all existing inheritance so Green Wins
            </p>
        </header>

    </body>
```