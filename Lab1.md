# Lab: Working with the Command Line

## Part 1, The Basics

1. How would you find the path (i.e., location) to the `gcc` command?

```sh
     which gcc
```

2. How would you download a file from the Internet?

```sh
     wget https://upload.wikimedia.org/wikipedia/commons/6/6e/Golde33443.jpg
```

3. What is the full command to read the manual page of the command that formats and displays the on-line manual pages? (NOTE: there is no typo to this question)

```sh
    man man
```

4. What command can you use to find out your IP address and MAC address?

```sh
    /sbin/ifconfig en0
```

5. What command can you use to show all the processes that are running on the system?

```sh
    top -o mem
```

6. What command can you use to get more details about running processes listening on ports?

```sh
    top -o mem
```

7. What command with flag could you use to list every file, including hidden files, on the entire system, showing their owner, location, and access time? Please also note the flags that you used with command.

```sh
    find / -ls 
```

8. Assume you found a file named `warrent.pdf`. What command could you use to find out what type of file this was?

```sh
    file warrent.pdf
```

9. So you discovered that `warrent.pdf` is a binary executable. What command could you use to extract any readable information from the file without running it? Also, try this on a compressed file such a ZIP or JAR

```sh
    strings warrent.pdf
```
- compressed the same file into a zip file and ran the same command on it. The output was gibberish.

- Downloaded a jar file and ran the same command on it. The output was something like this:

```sh
jakarta/faces/view/Location.classPKjakarta/faces/view/EditableValueHolderAttachedObjectHandler.classPK
```

10. What command can you use to find the IP address-to-MAC address mappings for systems on the local network?

```sh
    arp -a
```

11. Consider the following IP address: 	46[dot]252[dot]26[dot]153. Where is the computer with that IP address located --in what country?

```sh
    whois 46.252.26.153  
```

the result was this:

```sh
person:         Stephan Wolfram
address:        domainfactory GmbH
address:        Oskar-Messter-Str. 33
address:        85737 Ismaning
address:        DE
```

12. For the previous question, what command did you use to determine the location of the computer?

```sh
    whois 46.252.26.153  
```

13. What command can you use to securely delete a file?

```sh
    shred -u warrent.pdf
```

14. What command can you use to see if you are a computer administrator or superuser?

```sh
    whoami
```

15. What command can you use to see list of previous commands you have entered on command line?

```sh
    history
```

16. What command can you use to see list of scheduled tasks running on your computer?

```sh
    crontab -l
```

## Part 2, Wargames

Let's further hone your basic security skills by playing wargames.  This set of wargames is offered by OverTheWire (http://overthewire.org/wargames/).

Play the Bandit wargame at http://overthewire.org/wargames/bandit/, beginning with level 0.  Play as many levels as you can.  To get credit, show proof that you have played the Bandit wargames by submitting a screenshot of your terminal screen that shows the highest level you have completed (e.g., via Canvas).

_This part is dedicated to Olivia MacDougal, Class of 2018_

## Submitting This Lab

For students officially enrolled in the course, submit lab on Canvas.