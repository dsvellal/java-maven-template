# Welcome to the repository

## IMPORTANT: Run CI checks locally

Ensure that you have Node.js installed on the developer desktop.

Run the [checks.sh](./checks.sh) to see if there are any issues with lint or spelling or grammar.

```sh
./checks.sh
```

Run maven commands to validate the content of the project.

```sh
mvn clean install package
```

To run superlinter locally, see [this link](https://github.com/github/super-linter/blob/main/docs/run-linter-locally.md)

To ignore any valid spelling usage, add the valid spelling into [.spelling](./.spelling) file.
