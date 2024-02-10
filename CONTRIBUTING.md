# Contributing

In order to contribute, you will want to fork [https://github.com/Paul-Austin-Oswego-CSC480-HCI521/OZ-CSC-480-HCI-521-Spring-2024](https://github.com/Paul-Austin-Oswego-CSC480-HCI521/OZ-CSC-480-HCI-521-Spring-2024), making sure that the "Copy the main branch only" box is NOT checked if you want to be able to collaborate within your team's branch.

## General Workflow Overview:
1) Develop within your fork
2) Once you have something you want to share or just save, do a Git Commit
3) To move onto your GitHub remote, do Git Push
4) To share, create a Pull Request (different than Git Pull...) and specify which branch you would like to merge into (e.g. main, engine, gui, etc.)
5) Await approval/review from the Triage team if making a PR to the main branch, otherwise from any classmate 

NOTE: Push requests are not enabled, you MUST create a Pull Request so that it can be properly triaged.

## Using VS Code to Contribute

This suggested workflow requires that you have integrated with GitHub and are also using the "GitHub Pull Request" extension.

### One-Time Setup:
1) Open an empty window
2) Open the SOURCE CONTROL tab on the far left pane
3) Click "Clone Repository"
4) Click "Clone from GitHub"
5) Select your forked repository
6) Select a folder to place the repository on your local machine

### Developing
Periodically, you will want to run "Git Pull" through the SOURCE CONTROL menu to get the latest changes from the class's repository.

### Contributing

Once you are done developing:

1) Click the SOURCE CONTROL tab on the far left pane
2) Type a message describing what you added
3) Click "Commit"
4) Select the GITHUB PULL REQUEST extension tab on the far left pane
5) Fill out a message describing what you added
6) 

# Branches:
### Main branch:
* Requires approval of Pull Requests by Triage team
* TO DO: ~~The main branch runs CI/CD (tests, lints, deployment) through GitHub Actions for each Pull Request.~~

### Team branches:
* Requires approval of at least one other classmate
* ~~Team branches do NOT run CI/CD (tests, lints, deployment) on each Pull Request.~~
