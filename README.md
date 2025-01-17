<p align="center">
  <img src="https://raw.githubusercontent.com/MasterFlomaster1/SimpleJavaCrypter/master/content/SJC8.png">
</p>
<h1 align="center">SimpleJavaCrypter</h1>


<h3 align="center">Simple tool with GUI that can handle following tasks: file and text encryption/decryption, hash sum calculation and file checksum verifier, text encoding. Supports AES128, AES256, DES, 3DES, MD2, MD5, SHA1, SHA224, SHA256, SHA384, SHA512.</h1>

## Description

SimpleJavaCrypter is a program written in java which combines a number of useful functions: encryption/decryption of text and files with various algorithms, file and text hashsum calculation and file checksum verifier. There are several encryption algorithms available right now: AES-128, AES-256, DES, 3DES and SimpleCipher. The last one is a simple experimental encryption algorithm that can handle encryption and decryption of the text. Only English language is currently supported. Encryption is performed by an elementary algorithm which randomly changes chars in the given text. Text decryption is done by reverse algorithm. This encryption algorithm is currently under development and would need further work. List of all currently supported algorithms you can see below.

## Features

* Text encryption/decryption.
* File encryption/decryption.
* Generate random keys and secret combinations.
* Get current key.
* Encrypt/decrypt text and files with your own key.
* Simple, nice and adjustable GUI.
* Text hash-sum calculation.
* File hash-sum calculation.
* File checksum verifier.
* GUI drag and drop is supported.
* Dark theme.

## Supported encryption algorithms

* AES128
* AES256
* DES
* 3DES
* SimpleCipher (*under development*)

## Supported hashing algorithms

* MD2
* MD5
* SHA1
* SHA224
* SHA256
* SHA384
* SHA512

## Screenshots

Basic graphical user interface.

Application home page

![SimpleJavaCrypter](https://raw.githubusercontent.com/MasterFlomaster1/SimpleJavaCrypter/master/content/home.png)

## Usage

Text encryption/decryption example: 

![SimpleJavaCrypter](https://raw.githubusercontent.com/MasterFlomaster1/SimpleJavaCrypter/master/content/usage1.gif)

File encryption/decryption example:

![SimpleJavaCrypter](https://raw.githubusercontent.com/MasterFlomaster1/SimpleJavaCrypter/master/content/usage2.gif)

## TODO

1) ~~Simplify and improve existing GUI solution, to make it more pretty looking.~~
2) Add more encryption algorithms to work with.
3) ~~Add file encryption/decryption option.~~
4) Finish SimpleCipher algorithm.
5) ~~Add hash calculator function.~~
6) ~~Add file hash checking function.~~
7) ~~Add css.~~
8) Add multithreading.
9) Add more hashing algorithms.

## Requirements

Java 8 and above.

## Contributing and support

Feel free to contribute by opening issues or creating a pull request. Any help is appreciated :)

