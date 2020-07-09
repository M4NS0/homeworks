# John Hopkings University

<img src="https://github.com/M4NS0/Workspaces/blob/master/Web/Johns%20Hopkins%20University/JHUniversity-logo.png" width="900" />

## HTML, CSS and JavaScript for Web Developers

 Course Repository: [https://github.com/jhu-ep-coursera/fullstack-course4](https://github.com/jhu-ep-coursera/fullstack-course4)


## Development Enviroment Setup
- Git
- GitHub Account
- Chrome CDT
- Sublime Text 3
- Node JS
- Browser Sync 

### Installations and Procedures

1. Install node JS Version
2. Check nodeJS Version
```sh
$ npm nodejs --version
``` 
3. Check node Version
```sh
$ npm node --version
``` 
4. Install npm
5. Check npm Version
```sh
$ npm --version
``` 
6. Install Browser Sync
```sh
$ npm install -g browser-sync
```
7. Check Browser Sync Version
```sh
$ npm browser-sync --version
``` 
8. Removing node_modules from Git
```sh
$ git rm -r --cached node_modules
$ git commit -m 'Remove the now ignored directory node_modules'
$ git push origin master
```
#### Alternative to Browser Sync: 
1. Create a test repository
2. Create an index.html
```sh
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="UTF-8">
        <title>Document</title>
    </head>

    <body>
        Hello World
    </body>

</html>
```
3. Into test folder, run:
```sh
$ npm install -g live-server
```
3. In same folder, run:
```sh
$ live-server
```
#### Alternative to live-server
1. Install VsCode extension "Live Server"
