## Useful Linux Stuff

 <table>
        <thead>
            <tr>
                <th>Subject</th>
                <th>Shortcut</th>
            </tr>
        </thead>
        <tbody>
            <tr>
                <td>Screen Brightness</td>
                <td>
                    <a href="https://github.com/M4NS0/Workspaces/tree/master/Linux#screen-brightness"><img src="github.png" style="width:8px; height:12px" title="Screen Brightness" alt="Screen Brightness"></a>
                </td>
            </tr>
            <tr>
                <td>One Line Update/Upgrade</td>
                <td>
                    <a href="https://github.com/M4NS0/Workspaces/tree/master/Linux#one-line-updateupgrade"><img src="github.png" style="width:8px; height:12px" title="One Line Update/Upgrade" alt="One Line Update and Upgrade"></a>
                </td>
            </tr>
             <tr>
                <td>Git Ignoring Anything</td>
                <td>
                    <a href="https://github.com/M4NS0/Workspaces/tree/master/Linux#git-ignoring-anything"><img src="github.png" style="width:8px; height:12px" title="Git Ignoring Anything" alt="Git Ignoring Anything"></a>
                </td>
            </tr>

			<tr>
                <td>Boot-repair</td>
                <td>
                    <a href="https://github.com/M4NS0/Workspaces/tree/master/Linux#boot-repair"><img src="github.png" style="width:8px; height:12px" title="Boot-repair" alt="Boot-repair"></a>
                </td>
            </tr>

			<tr>
                <td>Removing PPA</td>
                <td>
                    <a href="https://github.com/M4NS0/Workspaces/tree/master/Linux#Removing-ppa"><img src="github.png" style="width:8px; height:12px" title="Removing PPA" alt="Removing PPA"></a>
                </td>
            </tr>
			
			<tr>
                <td> Fixing security vulnerabilities in npm dependencies on github</td>
                <td>
                    <a href="https://github.com/M4NS0/Workspaces/tree/master/Linux#fixing-security-vulnerabilities-in-npm-dependencies-github"><img src="github.png" style="width:8px; height:12px" title="Fixing security vulnerabilities in npm dependencies on github<" alt="Fixing security vulnerabilities in npm dependencies on github<"></a>
                </td>
            </tr>

        </tbody>
 </table>


<br>
<br>
<br>
<br>

###### Screen Brightness

1. To recognize the connected screens, run:
```sh
	$ xrandr -q
	# Or
	$ xrandr --listactivemonitors
```
2. Use the command with syntax: 
```sh
	$ xrandr --output Target-Screen --brightness Numeral-Value (x.x)
	$ xrandr --output Target-Screen --gamma Numeral-Group(x.xx:x.xx:x.xx)
```
> Exemple:
```sh
	$ xrandr --output HDMI-0 --brightness 1 
	$ xrandr --output DVI-1 --brightness 1
	$ xrandr --output HDMI-0 --gamma 0.8:0.8:0.75
	$ xrandr --output HDMI-0 --brightness 0.85 --gamma 1.55:1.5:1.5 && xrandr --output DVI-1 --brightness 0.7 --gamma 1:1.2:1.4
```
> To check values, use:
```sh
	$ xrandr --verbose | grep -i brightness
	$ xrandr --verbose | grep -i gamma
```
<br>
<br>
<br>
<br>

###### One Line Update/Upgrade
```sh
	$ sudo apt update -y && sudo apt full-upgrade -y && sudo apt autoremove -y && sudo apt clean -y && sudo apt autoclean -y
```

<br>
<br>
<br>
<br>

###### Git Ignoring Anything
```sh
	$ git rm -r --cached <folder/file>
#commit and push
```
> Exemple:
```sh
	$ git rm -r --cached .vscode
#commit and push
```
<br>
<br>
<br>
<br>

###### Boot-repair
*from: https://askubuntu.com/questions/88384/how-can-i-repair-grub-how-to-get-ubuntu-back-after-installing-windows* 
```sh
	$ sudo add-apt-repository ppa:yannubuntu/boot-repair && sudo apt-get update
	$ sudo apt-get install -y boot-repair && boot-repair
```
<br>
<br>
<br>
<br>

###### Removing PPA
```sh
	$ sudo add-apt-repository --remove ppa:PPA_Name/ppa
```
<br>
<br>
<br>
<br>

###### Fixing security vulnerabilities in npm dependencies (GitHub)

```sh
	$ sudo npm update
	$ sudo npm install
	$ sudo npm audit
```

<br>
<br>
<br>
<br>


