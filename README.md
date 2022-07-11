# [DesignTechnologies.com](https://designtechnologies.com) invoicing command challenge

DesignTechnologies challenges you to create a Java application that lets you sum invoice documents.

This is a small task to evaluate potential hires.

## The task

We have a list of documents (**DocumentDTO**) containing data for invoices, credit and debit notes.
We also have a console command that should return the sum of all the documents.

**Note, that if we have a credit note, it should subtract from the total of the invoice and if we
have a debit note, it should add to the sum of the invoice.**

Document types:

- 1 = invoice
- 2 = credit note
- 3 = debit note

## Some pointers

- The application code MUST be covered by unit tests
- Make the calculation objects usable as a stand-alone component
- The application must handle the case, where the total of all the credit notes is bigger than the
  sum of the invoice

## Bonus Task:

- implement calculate REST API endpoint

## Example usage

Command:

```
./gradlew bootRun
```
