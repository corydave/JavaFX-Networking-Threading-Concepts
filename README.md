# JavaFX / Networking / Threading Example

This project demonstrates basic JavaFX (UI), networking and threading concepts. Three lessons take the user from no code to a JavaFX application which talks to a multi-threaded server.

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. 

### Prerequisites

* Java JDK
* An IDE or compiler
* git

## Running the lessons

Each lesson is included within a branch on the git repo. The `master` branch contains the fully functional code. Other branches:
* `Lesson-1-Uppercase-UI` - A basic JavaFX UI which accepts user input, alters the input and displays the altered text
* `Lesson-2a-Server` - A server implementation demonstrating sockets and threads
* `Lesson-2b-Client` - An _optional_ lesson with client code that tests the server
* `Lesson-3-UIServer` - Alter the code UI from lesson 1 to talk to the server from lesson 2a

In order to run a lesson, you will need to checkout the corresponding branch:

```
git checkout <branchname>
```
Where `branchname` is the name of the lesson to check out.

To run the UI (`Lesson-1-Uppercase-UI` and `Lesson-3-UIServer`):
```
java sample.Main
```

To run the server (`Lesson-2a-Server`):
```
java sample.RemoteServer
```

To run the client (`Lesson-2b-Client`):
```
java sample.RemoteServerClient
```

Note that the server needs to be running for `master`, `Lesson-2b-Client` and `Lesson-3-UIServer`.

## Versioning

We use [SemVer](http://semver.org/) for versioning. For the versions available, see the [tags on this repository](https://github.com/hal313/JavaFX-Networking-Threading-Concepts/tags). 

## Authors

* **John Ghidiu** - *Initial work* - [JohnGhidiu](https://www.johnghidiu.com)

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details

## Acknowledgments

* Dave Ghidiu for the concepts and design