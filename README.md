## Getting started

### To clone
```sh
git clone --recursive https://github.com/CSBSJU/CSCI-160
```

### To update
```sh
git pull
```

```sh
git submodule update
```

To make this easier for yourself in the future, you can execute the command

```sh
git config alias.up '!git pull && git submodule update'
```

which will create a new git _alias_ (read: command) called `up`. That way, to
run the previous two commands, you can now use the single command

```sh
git up
```
