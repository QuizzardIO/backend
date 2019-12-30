# Quizzard - Memorization simplified

### Guidelines
- Alt på engelsk!
- 2 spaces
- Comments where needed
- React hooks, ikke klasser

### Stack
Frontend
- React
  - Hooks
- Styling
  - Styled Components

Backend
- Kotlin
- Spring Boot
- MongoDB
  - Data is saved as JSON

#### API endpoints

**User**
/users/ - List of users

/users/*user_id*/ - Get specific users

/users/*user_id*/wrongs/*subject_code*/ - List of global question ID's 

/users/*user_id*/starred/ - List of global question ID's 

**Course**
/subjects/ - List of subject codes

/subjects/*subject_code*/summary/ - Relevant information about subject
- Number of questions
- Number of correct answers
- Number of wrong answers
- Available exams

/subjects/*subject_code*/*exam_code*/ - Get all questions from a given exam

/subjects/*subject_code*/stats/ - Get stats