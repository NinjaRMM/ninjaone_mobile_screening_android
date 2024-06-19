# Sample application for developer evaluation

Here is the link to the Zelda API source/documentation.  
https://gadhagod.github.io/Hyrule-Compendium-API

1. Please download this repo and get the app up and running on your machine/IDE. Below is a list of bugs/tasks to complete as part of this evaluation.

2. Things to fix/add:

   2.1 - Zelda App

   In the /screenshots folder you will find what the Zelda UI should look like. Please reference them when correcting the issues below.
    - The app is crashing on launch for 2 reasons, please determine why it’s crashing and make the corrections.
    - Determine why the description isn’t showing in each list item and fix.
    - Determine why the details screen isn’t showing all the mapped information correctly and fix.
    - There are inconstancies in the text formatting in the application, find where the issues are and fix them.
    - In CategoryItemListUseCase.kt there is an API request that needs to be added noted by // TODO: Implement the request here.
    - In the search functionality show the close icon instead of the search icon when the user enters text.

   2.2 - Errors and Validation:  

   In the ErrorsAndValidationScreen, you will see a view that allows the user to enter an e-mail, phone, and MFA code. You should:
    - Validate these three items using a custom Error type, and expose the validation result to the view.
    - See ErrorsValidationViewModel for details about the defintion of "valid".
    - Show the user an error message for any invalid item.
    - Show the user a success message if all the items are valid.
    - Bonus: Add all unit tests you see fit

   2.3 - Custom Task  

   In the CustomTaskScreen, write and design a view that shows an alert banner for different messages (Snackbar). Update the appearance for different types of alerts (Success, Error, Warning, Info).
    - Use any libraries/frameworks you like.
    - Populate the view model with properties that will be displayed.
    - Bonus: Feel free to make any changes and cleanup any code that you feel will improve this application. Provide a Readme file documenting why the changes are an improvement.