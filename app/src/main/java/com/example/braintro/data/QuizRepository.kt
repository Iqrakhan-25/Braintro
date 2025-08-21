package com.example.braintro.data

import com.example.braintro.model.Question

object QuestionRepository {

    fun getQuestionsByCategory(category: String): List<Question> {
        return when (category) {
            "General Knowledge" -> generalKnowledgeQuestions
            "Science" -> scienceQuestions
            "History" -> historyQuestions
            "Geography" -> geographyQuestions
            "Mathematics" -> mathQuestions
            "Sports" -> sportsQuestions
            "Technology" -> technologyQuestions
            "Politics" -> politicsQuestions
            "Current Affairs" -> currentAffairsQuestions
            "Literature" -> literatureQuestions
            "Music" -> musicQuestions
            "Movies" -> movieQuestions
            "Art" -> artQuestions
            "Computer Science" -> computerScienceQuestions
            "Animals" -> animalQuestions
            "Food & Drinks" -> foodQuestions
            else -> emptyList()
        }
    }

    // ---------------- General Knowledge (60% Pakistan, 40% Global) ----------------
    private val generalKnowledgeQuestions = listOf(
        Question("What is the national language of Pakistan?", listOf("Urdu", "Punjabi", "Sindhi", "Pashto"), 0),
        Question("Which city is known as the City of Lights in Pakistan?", listOf("Karachi", "Lahore", "Islamabad", "Quetta"), 0),
        Question("Which is the national flower of Pakistan?", listOf("Rose", "Jasmine", "Tulip", "Sunflower"), 1),
        Question("What is the capital city of Pakistan?", listOf("Karachi", "Islamabad", "Lahore", "Rawalpindi"), 1),
        Question("Who was the founder of Pakistan?", listOf("Allama Iqbal", "Liaquat Ali Khan", "Muhammad Ali Jinnah", "Ayub Khan"), 2),
        Question("What is the largest continent in the world?", listOf("Africa", "Asia", "Europe", "North America"), 1),
        Question("Which planet is known as the Red Planet?", listOf("Venus", "Mars", "Jupiter", "Saturn"), 1),
        Question("Who painted the Mona Lisa?", listOf("Van Gogh", "Leonardo da Vinci", "Michelangelo", "Picasso"), 1),
        Question("What is the largest ocean in the world?", listOf("Indian Ocean", "Atlantic Ocean", "Pacific Ocean", "Arctic Ocean"), 2),
        Question("Which country invented paper?", listOf("China", "Egypt", "Greece", "India"), 0)
    )

    // ---------------- Science (40% Pakistan, 60% Global) ----------------
    private val scienceQuestions = listOf(
        Question("Who is known as the father of nuclear program in Pakistan?", listOf("Abdul Qadeer Khan", "Ishfaq Ahmad", "Abdus Salam", "Munir Ahmad Khan"), 0),
        Question("Which Pakistani scientist won the Nobel Prize in Physics?", listOf("Abdus Salam", "A.Q. Khan", "Pervez Hoodbhoy", "Atta-ur-Rahman"), 0),
        Question("What is the space agency of Pakistan called?", listOf("SPARCO", "SUPARCO", "NASA", "ISRO"), 1),
        Question("Which element is abundant in Pakistan’s Salt Range?", listOf("Iron", "Salt", "Coal", "Copper"), 1),
        Question("Which Pakistani city is known as the hub of surgical instruments?", listOf("Lahore", "Sialkot", "Karachi", "Multan"), 1),
        Question("What is the chemical symbol of Gold?", listOf("Au", "Ag", "Gd", "Go"), 0),
        Question("What is the boiling point of water?", listOf("90°C", "100°C", "110°C", "120°C"), 1),
        Question("What is the largest planet in our solar system?", listOf("Saturn", "Earth", "Jupiter", "Neptune"), 2),
        Question("What is the study of earthquakes called?", listOf("Geology", "Seismology", "Ecology", "Meteorology"), 1),
        Question("DNA stands for?", listOf("Deoxyribonucleic Acid", "Deoxyribogenetic Acid", "Dynamic Nucleic Acid", "None"), 0)
    )

    // ---------------- History (60% Pakistan, 40% Global) ----------------
    private val historyQuestions = listOf(
        Question("When did Pakistan gain independence?", listOf("1945", "1947", "1948", "1950"), 1),
        Question("Who was the first Prime Minister of Pakistan?", listOf("Liaquat Ali Khan", "Ayub Khan", "Zulfikar Ali Bhutto", "Muhammad Ali Bogra"), 0),
        Question("What was the original capital of Pakistan?", listOf("Karachi", "Lahore", "Islamabad", "Rawalpindi"), 0),
        Question("Which movement demanded Pakistan?", listOf("Pakistan Movement", "Khilafat Movement", "Nehru Report", "Quit India Movement"), 0),
        Question("Who presented the Lahore Resolution 1940?", listOf("Liaquat Ali Khan", "Allama Iqbal", "A.K. Fazlul Huq", "Muhammad Ali Jinnah"), 2),
        Question("Who discovered America?", listOf("Christopher Columbus", "Vasco da Gama", "Magellan", "Marco Polo"), 0),
        Question("Who was the first President of USA?", listOf("George Washington", "Abraham Lincoln", "John Adams", "Thomas Jefferson"), 0),
        Question("In which year did World War II end?", listOf("1943", "1944", "1945", "1946"), 2),
        Question("Which empire built the Great Wall of China?", listOf("Qin Dynasty", "Ming Dynasty", "Han Dynasty", "Tang Dynasty"), 0),
        Question("Who was the first woman Prime Minister in the world?", listOf("Indira Gandhi", "Benazir Bhutto", "Margaret Thatcher", "Sirimavo Bandaranaike"), 3)
    )

    // ---------------- Geography (60% Pakistan, 40% Global) ----------------
    private val geographyQuestions = listOf(
        Question("Which is the highest mountain in Pakistan?", listOf("K2", "Nanga Parbat", "Broad Peak", "Mount Everest"), 0),
        Question("Which desert is located in Pakistan?", listOf("Sahara", "Thar", "Gobi", "Kalahari"), 1),
        Question("What is the largest province of Pakistan by area?", listOf("Punjab", "Sindh", "Balochistan", "KPK"), 2),
        Question("Which river is the longest in Pakistan?", listOf("Indus", "Jhelum", "Chenab", "Ravi"), 0),
        Question("Which city is famous for Khewra Salt Mine?", listOf("Karachi", "Lahore", "Jhelum", "Khewra"), 3),
        Question("Which is the largest desert in the world?", listOf("Thar", "Sahara", "Gobi", "Kalahari"), 1),
        Question("Which is the smallest country in the world?", listOf("Monaco", "Maldives", "Vatican City", "San Marino"), 2),
        Question("Which river is the longest in the world?", listOf("Amazon", "Nile", "Yangtze", "Mississippi"), 1),
        Question("Which is the highest mountain in the world?", listOf("K2", "Everest", "Kangchenjunga", "Makalu"), 1),
        Question("Which ocean lies on the east coast of the United States?", listOf("Atlantic", "Pacific", "Indian", "Arctic"), 0)
    )

    // ---------------- Mathematics (40% Pakistan, 60% Global) ----------------
    private val mathQuestions = listOf(
        Question("What is 2 + 2?", listOf("3", "4", "5", "6"), 1),
        Question("Square root of 64?", listOf("6", "7", "8", "9"), 2),
        Question("Who is known as the father of Algebra?", listOf("Al-Khwarizmi", "Pythagoras", "Euclid", "Newton"), 0),
        Question("What is 12 × 12?", listOf("124", "144", "154", "164"), 1),
        Question("What is the value of π (pi)?", listOf("3.14", "3.15", "3.13", "3.16"), 0),
        Question("Who introduced the concept of zero?", listOf("Aryabhata", "Al-Khwarizmi", "Newton", "Pythagoras"), 0),
        Question("What is the perimeter of a square with side 5?", listOf("20", "15", "25", "10"), 0),
        Question("What is 15% of 200?", listOf("20", "25", "30", "35"), 2),
        Question("What is 7 × 9?", listOf("56", "63", "64", "62"), 1),
        Question("What is log10 of 1000?", listOf("1", "2", "3", "4"), 2)
    )

    // ---------------- Sports (40% Pakistan, 60% Global) ----------------
    private val sportsQuestions = listOf(
        Question("Who won the 1992 Cricket World Cup for Pakistan?", listOf("Imran Khan", "Javed Miandad", "Wasim Akram", "Inzamam-ul-Haq"), 0),
        Question("Which is Pakistan’s national sport?", listOf("Cricket", "Hockey", "Football", "Polo"), 1),
        Question("Who is known as the Rawalpindi Express?", listOf("Wasim Akram", "Waqar Younis", "Shoaib Akhtar", "Imran Khan"), 2),
        Question("How many times did Pakistan win Hockey World Cup?", listOf("2", "3", "4", "5"), 2),
        Question("Who was Pakistan’s first cricket captain?", listOf("Imtiaz Ahmed", "Abdul Hafeez Kardar", "Hanif Mohammed", "Javed Burki"), 1),
        Question("Which country hosted the 2016 Olympics?", listOf("China", "Brazil", "UK", "Japan"), 1),
        Question("Which sport uses terms like love, deuce, ace?", listOf("Tennis", "Cricket", "Hockey", "Football"), 0),
        Question("Which footballer is known as 'CR7'?", listOf("Lionel Messi", "Cristiano Ronaldo", "Neymar", "Mbappe"), 1),
        Question("Which country has won the most FIFA World Cups?", listOf("Brazil", "Germany", "Argentina", "Italy"), 0),
        Question("In which sport is the Stanley Cup awarded?", listOf("Basketball", "Ice Hockey", "Baseball", "Tennis"), 1)
    )

    // ---------------- Technology (40% Pakistan, 60% Global) ----------------
    private val technologyQuestions = listOf(
        Question("Who is the founder of Careem?", listOf("Mudasir Sheikha", "Talal Gondal", "Zia Chishti", "Atif Awan"), 0),
        Question("Which Pakistani company developed Bykea app?", listOf("Bykea Pvt Ltd", "Careem", "Uber Pakistan", "Daraz"), 0),
        Question("Which Pakistani software is widely used in call centers?", listOf("Avanza", "Netsol", "TRG", "Systems Limited"), 2),
        Question("Who founded NetSol Technologies?", listOf("Salim Ghauri", "Arif Habib", "Mian Mansha", "Shahid Afridi"), 0),
        Question("Which is the first Pakistani space satellite?", listOf("Badr-A", "Badr-B", "Paksat-1R", "SUPARCO-1"), 0),
        Question("Who is the founder of Microsoft?", listOf("Bill Gates", "Steve Jobs", "Mark Zuckerberg", "Larry Page"), 0),
        Question("Which company developed Android?", listOf("Google", "Apple", "Microsoft", "Samsung"), 0),
        Question("Who invented the WWW (World Wide Web)?", listOf("Tim Berners-Lee", "Bill Gates", "Steve Jobs", "Mark Zuckerberg"), 0),
        Question("What does CPU stand for?", listOf("Central Processing Unit", "Central Program Unit", "Computer Processing Unit", "Control Processing Unit"), 0),
        Question("Which company owns YouTube?", listOf("Facebook", "Amazon", "Google", "Twitter"), 2)
    )

    // ---------------- Literature (40% Pakistan, 60% Global) ----------------
    private val literatureQuestions = listOf(
        Question("Who is Pakistan’s national poet?", listOf("Faiz Ahmed Faiz", "Allama Iqbal", "Ahmed Faraz", "Parveen Shakir"), 1),
        Question("Who wrote Pakistan’s national anthem lyrics?", listOf("Hafeez Jalandhari", "Allama Iqbal", "Josh Malihabadi", "Faiz"), 0),
        Question("Which Pakistani writer wrote 'My Feudal Lord'?", listOf("Tehmina Durrani", "Bapsi Sidhwa", "Kamila Shamsie", "Mohsin Hamid"), 0),
        Question("Which Pakistani won the Booker Prize?", listOf("Mohsin Hamid", "Bapsi Sidhwa", "Kamila Shamsie", "None"), 3),
        Question("Who is the author of 'The Reluctant Fundamentalist'?", listOf("Mohsin Hamid", "Kamila Shamsie", "Hanif Kureishi", "Bapsi Sidhwa"), 0),
        Question("Who wrote 'Romeo and Juliet'?", listOf("Charles Dickens", "William Shakespeare", "Leo Tolstoy", "Jane Austen"), 1),
        Question("Who wrote 'Pride and Prejudice'?", listOf("Jane Austen", "Emily Bronte", "Charlotte Bronte", "George Eliot"), 0),
        Question("Who wrote 'War and Peace'?", listOf("Leo Tolstoy", "Fyodor Dostoevsky", "Anton Chekhov", "Maxim Gorky"), 0),
        Question("Who is the author of 'The Odyssey'?", listOf("Homer", "Virgil", "Socrates", "Plato"), 0),
        Question("Who wrote 'Divine Comedy'?", listOf("Dante Alighieri", "Milton", "Homer", "Chaucer"), 0)
    )


    // ---------------- Arts & Culture (40% Pakistan, 60% Global) ----------------
    private val artsCultureQuestions = listOf(
        Question("Which Pakistani singer is known as the 'Queen of Melody'?", listOf("Nazia Hassan", "Abida Parveen", "Noor Jehan", "Reshma"), 2),
        Question("Which Pakistani artist painted 'Mother and Child'?", listOf("Sadequain", "Ismail Gulgee", "Shakir Ali", "Jamil Naqsh"), 3),
        Question("Which Pakistani musician composed 'Jazba-e-Junoon'?", listOf("Ali Azmat", "Salman Ahmad", "Nusrat Fateh Ali Khan", "Junoon Band"), 1),
        Question("Which Pakistani actress starred in 'Bol'?", listOf("Mahira Khan", "Humaima Malick", "Mehwish Hayat", "Saba Qamar"), 1),
        Question("Which Pakistani drama is called 'the mother of all dramas'?", listOf("Alpha Bravo Charlie", "Dhoop Kinare", "Tanhaiyan", "Humsafar"), 2),
        Question("Who painted the Mona Lisa?", listOf("Leonardo da Vinci", "Michelangelo", "Raphael", "Rembrandt"), 0),
        Question("Which country is famous for Flamenco dance?", listOf("Brazil", "Spain", "Italy", "France"), 1),
        Question("Who sculpted David?", listOf("Donatello", "Michelangelo", "Bernini", "Raphael"), 1),
        Question("Which is the most famous museum in Paris?", listOf("Louvre", "Orsay", "Pompidou", "Rodin"), 0),
        Question("Which Japanese art form uses folding paper?", listOf("Ikebana", "Origami", "Haiku", "Calligraphy"), 1)
    )
    // ---------------- Music ----------------
    private val musicQuestions = listOf(
        Question("Who is known as the 'King of Ghazals' in Pakistan?", listOf("Ghulam Ali", "Mehdi Hassan", "Jagjit Singh", "Nusrat Fateh Ali Khan"), 1),
        Question("Which Pakistani singer is famous for 'Afreen Afreen'?", listOf("Atif Aslam", "Nusrat Fateh Ali Khan", "Rahat Fateh Ali Khan", "Ali Zafar"), 1),
        Question("Who composed Pakistan’s national anthem tune?", listOf("Ahmad G. Chagla", "Hafeez Jalandhari", "Mehdi Hassan", "Nisar Bazmi"), 0),
        Question("Which band is known for the song 'Sayonee'?", listOf("Junoon", "Strings", "Noori", "Vital Signs"), 0),
        Question("Who sang 'Dil Dil Pakistan'?", listOf("Ali Zafar", "Vital Signs", "Atif Aslam", "Junaid Jamshed"), 1),
        Question("Who is known as the 'King of Pop' globally?", listOf("Michael Jackson", "Elvis Presley", "Prince", "Justin Timberlake"), 0),
        Question("Which band released the song 'Bohemian Rhapsody'?", listOf("The Beatles", "Queen", "Pink Floyd", "Rolling Stones"), 1),
        Question("Who is the lead singer of U2?", listOf("Bono", "Sting", "Freddie Mercury", "Kurt Cobain"), 0),
        Question("Which singer is called the 'Queen of Pop'?", listOf("Madonna", "Lady Gaga", "Beyoncé", "Whitney Houston"), 0),
        Question("Who wrote the song 'Imagine'?", listOf("John Lennon", "Paul McCartney", "George Harrison", "Bob Dylan"), 0)
    )

    // ---------------- Movies ----------------
    private val movieQuestions = listOf(
        Question("Who directed the Pakistani film 'Khuda Kay Liye'?", listOf("Shoib Mansoor", "Sarmad Khoosat", "Sharmeen Obaid", "Bilal Lashari"), 0),
        Question("Which Pakistani movie won an Oscar?", listOf("None", "Zinda Bhaag", "Joyland", "Saving Face"), 3),
        Question("Who played the lead in 'Bol'?", listOf("Mahira Khan", "Humaima Malick", "Mehwish Hayat", "Saba Qamar"), 1),
        Question("Which was Pakistan’s first feature film?", listOf("Teri Yaad", "Armaan", "Khuda Kay Liye", "Jago Hua Savera"), 0),
        Question("Which Pakistani director made 'The Legend of Maula Jatt'?", listOf("Bilal Lashari", "Shoib Mansoor", "Nabeel Qureshi", "Asim Abbasi"), 0),
        Question("Who directed 'Titanic'?", listOf("James Cameron", "Steven Spielberg", "Christopher Nolan", "Martin Scorsese"), 0),
        Question("Which movie won Best Picture Oscar in 2020?", listOf("1917", "Parasite", "Joker", "Green Book"), 1),
        Question("Who played Iron Man in the Marvel movies?", listOf("Chris Evans", "Robert Downey Jr.", "Chris Hemsworth", "Mark Ruffalo"), 1),
        Question("Which is the highest-grossing film of all time (2023)?", listOf("Avatar", "Titanic", "Avengers: Endgame", "Avatar: The Way of Water"), 0),
        Question("Which director is known for 'Inception' and 'The Dark Knight'?", listOf("James Cameron", "Christopher Nolan", "Steven Spielberg", "Ridley Scott"), 1)
    )

    // ---------------- Art ----------------
    private val artQuestions = listOf(
        Question("Who is Pakistan’s most famous truck artist?", listOf("Haider Ali", "Sadequain", "Ismail Gulgee", "Jamil Naqsh"), 0),
        Question("Which Pakistani artist painted murals in Lahore Museum?", listOf("Sadequain", "Abdur Rahman Chughtai", "Shakir Ali", "Ismail Gulgee"), 0),
        Question("Who is known as Pakistan’s Picasso?", listOf("Sadequain", "Ismail Gulgee", "Jamil Naqsh", "Zubeida Agha"), 0),
        Question("Which Pakistani painter is famous for Islamic calligraphy?", listOf("Sadequain", "Chughtai", "Ismail Gulgee", "Jamil Naqsh"), 2),
        Question("Who is Pakistan’s first female modern artist?", listOf("Anna Molka Ahmed", "Zubeida Agha", "Salima Hashmi", "Laila Shahzada"), 1),
        Question("Who painted the Mona Lisa?", listOf("Leonardo da Vinci", "Michelangelo", "Raphael", "Vincent Van Gogh"), 0),
        Question("Who painted 'Starry Night'?", listOf("Vincent Van Gogh", "Claude Monet", "Salvador Dalí", "Pablo Picasso"), 0),
        Question("Which artist is famous for Cubism?", listOf("Pablo Picasso", "Vincent Van Gogh", "Rembrandt", "Matisse"), 0),
        Question("The painting 'The Last Supper' was painted by?", listOf("Leonardo da Vinci", "Raphael", "Michelangelo", "Donatello"), 0),
        Question("Who painted 'The Persistence of Memory'?", listOf("Salvador Dalí", "Picasso", "Monet", "Matisse"), 0)
    )

    // ---------------- Politics ----------------
    private val politicsQuestions = listOf(
        Question("Who was Pakistan’s first Prime Minister?", listOf("Liaquat Ali Khan", "Muhammad Ali Bogra", "Khawaja Nazimuddin", "Ayub Khan"), 0),
        Question("Who was the first woman Prime Minister of Pakistan?", listOf("Benazir Bhutto", "Hina Rabbani Khar", "Fatima Jinnah", "Asma Jahangir"), 0),
        Question("Who is known as Quaid-e-Azam?", listOf("Liaquat Ali Khan", "Muhammad Ali Jinnah", "Allama Iqbal", "Ayub Khan"), 1),
        Question("Who was Pakistan’s first female Foreign Minister?", listOf("Hina Rabbani Khar", "Benazir Bhutto", "Tehmina Durrani", "Sherry Rehman"), 0),
        Question("Who imposed Pakistan’s first Martial Law?", listOf("Ayub Khan", "Yahya Khan", "Zia-ul-Haq", "Pervez Musharraf"), 0),
        Question("Who is the current UN Secretary-General?", listOf("Ban Ki-moon", "Antonio Guterres", "Kofi Annan", "Javier Perez de Cuellar"), 1),
        Question("Who was the first President of the United States?", listOf("Abraham Lincoln", "George Washington", "Thomas Jefferson", "John Adams"), 1),
        Question("Who is the current Prime Minister of the UK (2025)?", listOf("Rishi Sunak", "Boris Johnson", "Keir Starmer", "Theresa May"), 2),
        Question("Who is the founder of modern Turkey?", listOf("Mustafa Kemal Atatürk", "Recep Tayyip Erdogan", "Ismet Inonu", "Suleiman"), 0),
        Question("Who is the President of France (2025)?", listOf("Emmanuel Macron", "Nicolas Sarkozy", "Francois Hollande", "Marine Le Pen"), 0)
    )

    // ---------------- Current Affairs ----------------
    private val currentAffairsQuestions = listOf(
        Question("Who is the current Prime Minister of Pakistan (2025)?", listOf("Shehbaz Sharif", "Imran Khan", "Asif Ali Zardari", "Bilawal Bhutto"), 0),
        Question("Who is the current Chief of Army Staff (COAS) of Pakistan?", listOf("Qamar Javed Bajwa", "Asim Munir", "Raheel Sharif", "Pervez Kayani"), 1),
        Question("Which country recently hosted COP28?", listOf("UAE", "USA", "China", "India"), 0),
        Question("Which country won the FIFA World Cup 2022?", listOf("France", "Argentina", "Brazil", "Germany"), 1),
        Question("Which is the latest country to join BRICS (2024)?", listOf("Saudi Arabia", "Pakistan", "Iran", "Turkey"), 0),
        Question("Who is the current US President (2025)?", listOf("Donald Trump", "Joe Biden", "Kamala Harris", "Barack Obama"), 2),
        Question("Which tech company is leading in AI in 2025?", listOf("Google", "Microsoft", "OpenAI", "Apple"), 2),
        Question("Which country hosted the 2024 Olympics?", listOf("Japan", "France", "USA", "Australia"), 1),
        Question("Which city is the capital of Ukraine?", listOf("Kyiv", "Kharkiv", "Moscow", "Odessa"), 0),
        Question("Which country recently launched the Chandrayaan-3 mission?", listOf("China", "India", "Russia", "Japan"), 1)
    )

    // ---------------- Computer Science ----------------
    private val computerScienceQuestions = listOf(
        Question("Who is known as the father of computers?", listOf("Alan Turing", "Charles Babbage", "John von Neumann", "Bill Gates"), 1),
        Question("Which Pakistani company developed 'InPage' software?", listOf("NCR", "IBM Pakistan", "Concept Software", "Software House Lahore"), 2),
        Question("Who is the founder of MicroSoft?", listOf("Bill Gates", "Steve Jobs", "Mark Zuckerberg", "Elon Musk"), 0),
        Question("Which language is mainly used for Android development?", listOf("Kotlin", "Swift", "C#", "Ruby"), 0),
        Question("Which Pakistani female won the Turing Award?", listOf("None", "Arfa Karim", "Anousheh Ansari", "None of these"), 0),
        Question("What does CPU stand for?", listOf("Central Processing Unit", "Computer Personal Unit", "Central Program Utility", "Control Processing Unit"), 0),
        Question("Who founded Facebook?", listOf("Mark Zuckerberg", "Larry Page", "Sergey Brin", "Jack Dorsey"), 0),
        Question("Which company created the iPhone?", listOf("Apple", "Samsung", "Nokia", "Motorola"), 0),
        Question("Which programming language is used in web browsers?", listOf("JavaScript", "C++", "Python", "Kotlin"), 0),
        Question("What does AI stand for?", listOf("Artificial Intelligence", "Automated Interface", "Applied Information", "Advanced Integration"), 0)
    )

    // ---------------- Animals ----------------
    private val animalQuestions = listOf(
        Question("What is Pakistan’s national animal?", listOf("Lion", "Markhor", "Snow Leopard", "Tiger"), 1),
        Question("What is Pakistan’s national bird?", listOf("Chukar Partridge", "Shaheen Falcon", "Pigeon", "Eagle"), 0),
        Question("Which animal is called the 'Ship of the Desert'?", listOf("Horse", "Camel", "Donkey", "Goat"), 1),
        Question("What is the fastest land animal?", listOf("Cheetah", "Leopard", "Tiger", "Horse"), 0),
        Question("What is the largest mammal?", listOf("Elephant", "Blue Whale", "Giraffe", "Shark"), 1),
        Question("Which bird is known for mimicking sounds?", listOf("Parrot", "Crow", "Owl", "Peacock"), 0),
        Question("What is the only mammal that can fly?", listOf("Bat", "Flying Squirrel", "Eagle", "Butterfly"), 0),
        Question("Which animal is the king of the jungle?", listOf("Lion", "Tiger", "Leopard", "Cheetah"), 0),
        Question("Which animal lays the largest eggs?", listOf("Ostrich", "Penguin", "Emu", "Eagle"), 0),
        Question("What is the national aquatic mammal of Pakistan?", listOf("Indus River Dolphin", "Whale Shark", "Otter", "Seal"), 0)
    )

    // ---------------- Food & Drinks ----------------
    private val foodQuestions = listOf(
        Question("What is Pakistan’s national dish?", listOf("Biryani", "Nihari", "Karahi", "Pulao"), 1),
        Question("Which city of Pakistan is famous for Nihari?", listOf("Lahore", "Karachi", "Islamabad", "Hyderabad"), 1),
        Question("Which drink brand originated in Pakistan?", listOf("Pakola", "Coca Cola", "Pepsi", "7Up"), 0),
        Question("Which fruit is Pakistan famous for exporting?", listOf("Mango", "Apple", "Banana", "Grapes"), 0),
        Question("Which Pakistani city is famous for Halwa Puri?", listOf("Lahore", "Karachi", "Multan", "Hyderabad"), 0),
        Question("Which country invented Pizza?", listOf("USA", "Italy", "France", "Greece"), 1),
        Question("Sushi is a traditional dish of which country?", listOf("China", "Japan", "Korea", "Thailand"), 1),
        Question("Which fruit is known as the 'King of Fruits'?", listOf("Mango", "Apple", "Banana", "Pineapple"), 0),
        Question("Which drink is called 'the Champagne of Mineral Waters'?", listOf("Perrier", "San Pellegrino", "Evian", "Dasani"), 0),
        Question("Which fast food chain introduced the Big Mac?", listOf("Burger King", "McDonald’s", "KFC", "Subway"), 1)
    )
}
