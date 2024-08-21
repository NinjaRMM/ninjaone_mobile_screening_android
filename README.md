1. Please download this repo and get the app running on your machine/IDE.

2. Feel free to improve any pre-developed code. If so, please add a new IMPROVEMENTS_README.md to the project and list the 
   improvements you've made.

3. Things to fix/add:

   3.1 - Navigation Assessment
   - In the ScreeningNavHost.kt file, add a Nested Navigation Graph for the Navigation Assessment.
   - In the Navigation Assessment Navigation Graph, add three destinations in the following order: PersonalDataScreen, PersonalPreferencesScreen, and CreateUserScreen.
   - PersonalDataScreen: This screen must contain "Email" input TextField, "Password" input TextField, and a "Next" button.
      - Email TextField -> is valid with a normal format such as username@domain.com.
      - Password TextField -> is valid with at least one letter, and one number, and the minimum length is 6.
      - Next Button -> Enabled only when Email TextField and Password TextField are valid. When clicking on it, navigate to PersonalPreferencesScreen.
      - Email and Password input validation must be done in a UseCase class. Use Dagger Hilt to inject it into the ViewModel.
      - This screen must send all the inputted data to the next one.
   - PersonalPreferencesScreen: This screen contains two Single Selectable fields "Pets", "Interests", and a "Next" button.
      - Pets Selectable Field -> When clicking on it, must open the PetsBottomSheet.
         - Create PetsBottomSheet, you can rely on the InterestsBottomSheet implementation.
         - After selecting an option, the PetsBottomSheet must be closed and the selected option must be shown in the Pets Selectable Field.
         - The Pets Selectable Field is valid only when there is a selected option.
      - Interests Selectable Field -> When clicking on it, must open the InterestsBottomSheet.
         - After selecting an option, the InterestsBottomSheet must be closed and the selected option must be shown in the Interests Selectable Field.
         - The Interests Selectable Field is valid only when there is a selected option.
      - Next Button -> Enabled only when Interests Selectable Field and Pets Selectable Field are both valid. When clicking on it, navigate to CreateUserScreen.
      - This screen must send all the inputted and selected data to the next one.
   - CreateUserScreen: This screen must show all the data previously inputted/selected and a button "Create user".
      - Create User Button -> When clicking on it, navigate back to DashboardScreen, and then in the DashboardScreen, 
         show a Snackbar with the message: "$email user created successfully.", where $email is a back parameter returned from CreateUserScreen.

   3.2 - Add Unit Tests for all Navigation Assessment classes you might find useful.

   3.3 - Pagination Assessment
   - There are two errors causing crashes when hitting the "Pagination Assessment" button, you must figure them out to proceed.
   - Create a Repository object to get info from the CharacterService and use it in the CharacterListUseCase.
   - In the PaginationAssessmentScreen, show the Character list using [Paging3](https://developer.android.com/topic/libraries/architecture/paging/v3-overview). 
     You can find more details about the backend API [here](https://rickandmortyapi.com/documentation).
   - Set up the Paging to have a prefetch distance that results in an infinite scroll behavior.
   - Implement the character Image loading with the Coil library.

4. Please share with us any other improvements you would've made if you had more time at a new file called 
   OTHER_IMPROVEMENTS_README.md.
