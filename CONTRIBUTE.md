# Contributing Guidelines

## Suggested Workflow/Tips:
### Development
1. DEVELOP within your personal branch (pull OR push access with no need for approval in order to merge)
2. SHARE WITH YOUR TEAM by making a Pull Request within your team's branch (approval from at least one team member required in order to be merged)
3. SHARE WITH ORGANIZATION/CLASS by making a Pull Request within the main branch (approval from either @Phantasmogenesis or QA team required in order to be merged)

### Triage
* When another member of your team makes a Pull Request into your team's branch, you may approve the Pull Request, allowing it to be merged into your team's branch.

## Information on Branches:
### Main Branch:

* When making a Pull Request to the 'main' branch of the repository, approval from either @Phantasmogenesis or a member of the QA team is required in order for the PR to be merged.

* The main branch runs CI/CD (tests, lints, deployment) through GitHub Actions for each Pull Request.

### Team Branches:
* When making a Pull Request to a particular team's branch of the repository, approval from at least one other member of that team is required in order for the PR to be merged.

* Team branches do NOT run CI/CD (tests, lints, deployment) on each Pull Request.