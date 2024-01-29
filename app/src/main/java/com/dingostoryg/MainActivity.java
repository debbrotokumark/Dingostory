package com.dingostoryg;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button golpo1,golpo2,golpo3,golpo4,golpo5,golpo6,golpo7,golpo8,golpo9,golpo10;
    public static String golpohead,golpobody;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        golpo1 = findViewById(R.id.golpo1);
        golpo2=findViewById(R.id.golpo2);
        golpo3=findViewById(R.id.golpo3);
        golpo4=findViewById(R.id.golpo4);
        golpo5=findViewById(R.id.golpo5);
        golpo6=findViewById(R.id.golpo6);
        golpo7=findViewById(R.id.golpo7);
        golpo8=findViewById(R.id.golpo8);
        golpo9=findViewById(R.id.golpo9);
        golpo10=findViewById(R.id.golpo10);

        golpo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                golpohead= getString(R.string.golpo1);
                //golpobody=getString(R.string.golpo11);
                golpobody="Once upon a time, in the quaint village of Meadowbrook, there lived an old farmer named Amos Higgins. Amos was a weathered man, his face etched with the lines of countless seasons spent tilling the soil and tending to his crops. His farm, known as Sunflower Acres, had been in his family for generations, and Amos took great pride in maintaining the agricultural traditions passed down to him.\n" +
                        "\n" +
                        "Amos was a man of routine. Every morning, before the sun had a chance to cast its golden glow upon the fields, he would rise from his creaky bed and make his way to the barn. With the rooster's crow as his alarm clock, he'd begin his day with a hearty breakfast and a steaming cup of black coffee.\n" +
                        "\n" +
                        "The heart of Sunflower Acres was its vibrant sunflower fields, stretching as far as the eye could see. Amos had a special fondness for these cheerful flowers, their golden heads always turning to face the sun. It was said in Meadowbrook that the sunflowers in Amos's fields were the tallest and most radiant in the entire region.\n" +
                        "\n" +
                        "One year, a particularly harsh drought swept through the village, threatening the livelihood of the farmers. Crops withered, and the once-green fields turned to a dusty brown. The community was in despair, fearing the loss of their harvest and the hardships that would follow.\n" +
                        "\n" +
                        "Amos, however, was not one to be easily discouraged. With a twinkle in his eye and a determined spirit, he decided to share his well-kept secret with the other farmers. Early one morning, he gathered them in the town square and spoke of an ancient technique passed down through generations in his family – a method of conserving water and nourishing the soil.\n" +
                        "\n" +
                        "The farmers listened intently as Amos shared his wisdom, demonstrating how to create small channels between the rows to direct water efficiently, and how to enrich the soil with organic compost. The skeptical faces soon transformed into expressions of hope, and the community, inspired by the old farmer, worked together to implement Amos's traditional farming practices.\n" +
                        "\n" +
                        "As the weeks passed, a miraculous transformation occurred. The sunflower fields, once thought doomed, began to flourish. The vibrant yellow petals stretched toward the sky, and the village of Meadowbrook was saved from the clutches of the drought.\n" +
                        "\n" +
                        "Amos Higgins, the old farmer with a heart as resilient as the sunflowers he cherished, became a local hero. The community celebrated his wisdom, and Sunflower Acres became a symbol of resilience and the enduring spirit of tradition.\n" +
                        "\n" +
                        "And so, in the heart of Meadowbrook, Amos continued to tend to his fields, sharing his knowledge and wisdom with generations to come. The tale of the old farmer and his sunflower fields echoed through the village, a reminder that sometimes, the answers to life's challenges can be found in the timeless traditions passed down by those who came before.";
                Intent tent =new Intent(MainActivity.this,storytext.class);
                startActivity(tent);

            }
        });
        golpo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                golpohead= getString(R.string.golpo2);
               // golpobody=getString(R.string.golpo22);
                golpobody="Once upon a time, nestled in the heart of a bustling town, there was a quaint little shop known as \"Mystical Finds.\" Owned by an eccentric character named Elara, the shop had an aura of magic and mystery that drew curious customers from near and far.\n" +
                        "\n" +
                        "Elara, with her silver hair and eyes that sparkled like stars, had a penchant for collecting unique and enchanted items. Mystical Finds was a treasure trove of wonders, from ancient spell books to sparkling crystals that seemed to hum with energy. The shelves were lined with potions brewed from rare herbs, and trinkets adorned every nook and cranny.\n" +
                        "\n" +
                        "The shop quickly became a haven for those seeking a touch of magic in their lives. Customers would enter with wide-eyed wonder, exploring the maze of shelves filled with curiosities. Elara, with a mischievous grin, would share the stories behind each item, infusing the shop with an enchanting atmosphere.\n" +
                        "\n" +
                        "One day, a shy young girl named Lily wandered into Mystical Finds. Her eyes widened as she discovered a dusty, leather-bound book on a high shelf. Elara noticed Lily's interest and gently explained that the book held the secrets of forgotten spells and ancient rituals. Lily, entranced, decided to purchase the book, hoping to uncover the magic within its pages.\n" +
                        "\n" +
                        "As days turned into weeks, Mystical Finds became a hub for the community. Elara organized magical workshops, teaching potion-making and spell-casting to eager learners. The shop's fame spread, and people came not just for the enchanted items but also for the sense of wonder and camaraderie that permeated the air.\n" +
                        "\n" +
                        "However, every story has its challenges. A greedy developer eyed the prime location of Mystical Finds, intending to replace it with a modern structure. News of the impending threat spread through the town, and the community rallied to save their beloved shop.\n" +
                        "\n" +
                        "Elara, with her magical prowess, organized a magical carnival to raise funds and awareness. The townsfolk showcased their newfound skills, turning the event into a spectacle that captured the hearts of everyone who attended. The carnival's success not only saved Mystical Finds but also brought the community closer together.\n" +
                        "\n" +
                        "And so, Mystical Finds continued to thrive, enchanting visitors with its magical ambiance and captivating treasures. Elara, with her silver hair and twinkling eyes, remained the guardian of wonder in the heart of the bustling town, proving that a touch of magic could create a haven of joy and unity in the most unexpected places.";
                Intent tent =new Intent(MainActivity.this,storytext.class);
                startActivity(tent);

            }
        });
        golpo3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                golpohead= getString(R.string.golpo3);
                golpobody="In a cozy neighborhood, a peculiar friendship blossomed between two unlikely companions—Whiskers, a mischievous orange tabby cat, and Rocky, a playful golden retriever with boundless energy.\n" +
                        "\n" +
                        "Whiskers, known for his aloof demeanor, often perched on the windowsill of Mrs. Thompson's house, surveying the world with an air of superiority. Meanwhile, Rocky could be found in the Thompsons' backyard, chasing after balls and wagging his tail with unbridled joy.\n" +
                        "\n" +
                        "One sunny afternoon, their paths crossed when Whiskers, feeling adventurous, decided to explore the backyard. Rocky, always on the lookout for a new playmate, bounded over with enthusiasm. Initially skeptical, Whiskers eyed the exuberant dog cautiously. However, Rocky's friendly disposition quickly melted away any feline reservations.\n" +
                        "\n" +
                        "What followed was an unexpected friendship that brought joy to the entire neighborhood. Whiskers discovered the thrill of racing around the yard, darting between bushes with Rocky in hot pursuit. In return, Rocky learned the art of patience as he observed Whiskers gracefully leaping onto fences and balancing on narrow ledges.\n" +
                        "\n" +
                        "Their antics became a daily source of entertainment for the neighbors, who marveled at the odd yet heartwarming camaraderie. The duo's adventures were not confined to the backyard; they explored the neighborhood together, with Whiskers riding on Rocky's back like a regal king surveying his kingdom.\n" +
                        "\n" +
                        "As the seasons changed, so did the dynamics of their friendship. In winter, Whiskers found comfort in the warmth of Rocky's fur, while Rocky cherished the quiet companionship of his feline friend by the fireplace.\n" +
                        "\n" +
                        "One day, a new family moved into the neighborhood with a feisty kitten named Mittens. Initially hesitant, Whiskers and Rocky welcomed Mittens into their friendship circle, expanding their trio into a charming quartet. Together, they became a symbol of unity and friendship in the neighborhood, proving that differences could indeed create the most beautiful bonds.\n" +
                        "\n" +
                        "And so, in the heart of the cozy neighborhood, the cat, the dog, and the kitten continued to share laughter, adventures, and the warmth of true friendship, creating a tale that echoed through the community as a testament to the magic that happens when unlikely friends come together.";
                Intent tent =new Intent(MainActivity.this,storytext.class);
                startActivity(tent);

            }
        });
        golpo4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                golpohead= getString(R.string.golpo4);
                golpobody="On a bustling train journey through picturesque landscapes, two individuals found themselves seated side by side—Evelyn, an elderly woman with a penchant for classic literature and a love for nostalgic melodies, and Jake, a tech-savvy young man with a perpetual connection to his gadgets and an affinity for the latest trends.\n" +
                        "\n" +
                        "Evelyn, with her silver hair neatly tucked under a floral hat, clutched a worn copy of Jane Austen's \"Pride and Prejudice.\" She savored the elegant prose, periodically glancing out the window at the passing scenery. Her eyes twinkled with the wisdom of years spent absorbing the nuances of life.\n" +
                        "\n" +
                        "Opposite her sat Jake, whose fingers danced across the sleek screen of his tablet, engrossed in a virtual world of social media updates and trending topics. His earphones pumped energetic beats into his ears, creating a personal bubble that shielded him from the world outside.\n" +
                        "\n" +
                        "Despite the stark contrast in their interests and lifestyles, the rhythmic hum of the train and the shared space initiated an unexpected conversation. Evelyn, breaking the silence, inquired about the gadget in Jake's hands, expressing genuine curiosity about the rapid advancements in technology. Jake, momentarily disconnecting from his digital realm, listened attentively as Evelyn recounted tales of a bygone era.\n" +
                        "\n" +
                        "As the journey unfolded, a fascinating exchange ensued. Evelyn introduced Jake to the timeless charm of literature, encouraging him to explore worlds beyond pixels and screens. In return, Jake shared the wonders of the digital age with Evelyn, opening her eyes to the instant connectivity and wealth of information at her fingertips.\n" +
                        "\n" +
                        "The clinking of teacups at the onboard café marked a turning point in their interaction. Evelyn put away her book, and Jake stowed his tablet. They decided to share a table, bridging the generational gap with discussions that transcended stereotypes. Their laughter echoed through the train car as they traded stories, realizing that, despite their differences, they were more alike than they had initially presumed.\n" +
                        "\n" +
                        "As the train approached its destination, Evelyn and Jake exchanged contact information, promising to stay connected beyond the confines of the journey. The unlikely companions bid farewell with genuine smiles, enriched by the unique perspectives they had shared.\n" +
                        "\n" +
                        "In this seemingly ordinary train ride, two contrary souls discovered the beauty of finding common ground amidst diversity, proving that connections can bloom in the most unexpected places, even between the pages of a classic novel and the glow of a digital screen.";
                Intent tent =new Intent(MainActivity.this,storytext.class);
                startActivity(tent);

            }
        });
        golpo5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                golpohead= getString(R.string.golpo5);
                golpobody="In the small town of Giggleville, where laughter was the official language, lived a cheeky little girl named Zoe. From the moment she could talk, Zoe had a knack for turning ordinary situations into uproarious adventures.\n" +
                        "\n" +
                        "One sunny day, as Zoe strolled through the park with her trusty rubber chicken, Sir Clucks-a-Lot, she noticed a group of adults engaged in a serious game of chess. The sight of their furrowed brows and concentrated expressions sparked an idea in Zoe's mischievous mind.\n" +
                        "\n" +
                        "She waltzed over to the chessboard, her rubber chicken squawking with each step. With an innocent smile, Zoe declared, \"I challenge you all to a game of Extreme Chess!\"\n" +
                        "\n" +
                        "The adults, amused by the little girl's audacity, agreed to indulge her whimsical request. Zoe, with Sir Clucks-a-Lot perched on her shoulder like a feathered parrot, proceeded to explain the rules of Extreme Chess.\n" +
                        "\n" +
                        "\"In this version,\" she declared, \"every time a piece is captured, you have to tell a silly joke or do a funny dance! And if you checkmate, you have to wear this clown wig for the rest of the day!\"\n" +
                        "\n" +
                        "The park soon echoed with laughter as the once-serious chess game transformed into a spectacle of jokes, dance moves, and colorful wigs. Zoe's infectious giggles filled the air as even the most stoic players couldn't help but succumb to the hilarity of Extreme Chess.\n" +
                        "\n" +
                        "Passersby, drawn in by the commotion, joined in the laughter, turning the park into a impromptu comedy festival. The chess game became a highlight of Giggleville, and people eagerly awaited Zoe's next unpredictable adventure.\n" +
                        "\n" +
                        "As the sun set on Giggleville, Zoe and her rubber chicken strolled away from the park, leaving behind a trail of smiles and chuckles. The adults, now wearing a mix of clown wigs and silly grins, exchanged grateful glances for the unexpected dose of joy that the cheeky little girl had brought to their day.\n" +
                        "\n" +
                        "And so, in the town where laughter reigned supreme, Zoe continued to sprinkle her mischievous magic, turning everyday moments into sidesplitting memories for the delight of everyone in Giggleville.";
                Intent tent =new Intent(MainActivity.this,storytext.class);
                startActivity(tent);

            }
        });
        golpo6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                golpohead= getString(R.string.golpo6);
                golpobody="One sunny Saturday, Billy found himself on an adventure to his friend Andy's house. The two friends, known for their wild imaginations and endless energy, had planned a day of epic proportions.\n" +
                        "\n" +
                        "As Billy arrived, Andy greeted him with a mischievous grin. \"Today, my friend, is the day we turn my house into a secret lair of fun!\" Andy exclaimed.\n" +
                        "\n" +
                        "The duo began their mission, armed with cardboard boxes, blankets, and a whole lot of tape. They transformed the living room into a spaceship, the kitchen into a candy factory, and the backyard into a pirate's cove. Every room held a new surprise, and Andy's house quickly morphed into the ultimate playground of imagination.\n" +
                        "\n" +
                        "Their laughter echoed through the halls as they leaped from one adventure to another. The couch became a fortress, the stairs transformed into a treacherous mountain to climb, and the backyard was the setting for a daring treasure hunt. Each room had its own theme, and the friends embraced every opportunity to dive headfirst into their imaginary worlds.\n" +
                        "\n" +
                        "In the midst of their escapades, they stumbled upon a mysterious door in the attic. With wide-eyed curiosity, they cautiously opened it, half-expecting to find a hidden passage to another dimension. Instead, they discovered a forgotten box of old toys and games.\n" +
                        "\n" +
                        "Eager to explore the treasures within, Billy and Andy unearthed classic board games, action figures, and puzzles. They decided to have a \"blast from the past\" gaming marathon, relishing in the simple joys of childhood. The sound of dice rolling, cards shuffling, and laughter filled the room as they rediscovered the timeless fun of their favorite games.\n" +
                        "\n" +
                        "As the day turned to dusk, the friends gathered in the backyard to cap off their adventure. Armed with flashlights and a blanket fort, they indulged in an impromptu camping trip. Under the starry night sky, they shared stories, giggled about their wild day, and marveled at the magic they had created within the walls of Andy's house.\n" +
                        "\n" +
                        "With the moon as their nightlight, Billy and Andy drifted off to sleep, dreaming of the countless adventures that awaited them in the future. And so, in the cozy embrace of friendship and imagination, the little house became a haven of laughter, creativity, and endless possibilities for Billy and Andy.";
                Intent tent =new Intent(MainActivity.this,storytext.class);
                startActivity(tent);

            }
        });
        golpo7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                golpohead= getString(R.string.golpo7);
                golpobody="\n" +
                        "One lazy Sunday afternoon, I found myself on a spontaneous adventure with my dad. Armed with a spirit of exploration and a sense of humor, we set out to turn our ordinary day into something extraordinary.\n" +
                        "\n" +
                        "Our first stop was the local hardware store. My dad, known for his knack for DIY projects, had an ambitious idea in mind. We decided to build a makeshift spaceship out of cardboard boxes. As we roamed the aisles, picking up supplies and exchanging playful banter, the anticipation of our cosmic creation filled the air.\n" +
                        "\n" +
                        "Back at home, armed with scissors and duct tape, we transformed the living room into our intergalactic command center. Cardboard wings adorned with glittering foil, control panels made from recycled buttons, and a \"launch pad\" made of cushions—our spaceship was ready for liftoff. We giggled like kids as we imagined soaring through the galaxy on our whimsical creation.\n" +
                        "\n" +
                        "But the adventure didn't end there. My dad, with a twinkle in his eye, suggested we embark on a culinary exploration. We donned aprons and transformed the kitchen into a culinary laboratory. Our mission: to create the most extravagant, outlandish sandwiches imaginable. From peanut butter and pickles to marshmallow and cheese, each layer was a surprise waiting to be discovered.\n" +
                        "\n" +
                        "With a spread of ingredients before us, we crafted sandwiches that defied culinary norms. As we took the first bites, we exchanged looks of both skepticism and delight. Surprisingly, the unconventional combinations had a charm of their own, and we savored the taste of our unique creations, relishing in the joy of culinary experimentation.\n" +
                        "\n" +
                        "The day continued with a spontaneous road trip. We hopped into the car, tunes playing on the radio, and drove with no destination in mind. We found ourselves exploring hidden gems in the outskirts of town—quaint roadside cafes, scenic viewpoints, and quirky roadside attractions. Each discovery added a new chapter to our impromptu adventure.\n" +
                        "\n" +
                        "As the sun dipped below the horizon, we returned home with hearts full of laughter and memories. Our ordinary day had transformed into a series of whimsical escapades, a testament to the magic that happens when you embrace spontaneity and shared moments with a loved one.\n" +
                        "\n" +
                        "In the quiet moments before bedtime, as we reflected on the day's adventures, I realized that the true magic wasn't in the cardboard spaceship or the peculiar sandwiches. It was in the laughter, the shared creativity, and the simple joy of spending an ordinary day with my extraordinary dad—transforming the mundane into a treasure trove of unforgettable moments.";
                Intent tent =new Intent(MainActivity.this,storytext.class);
                startActivity(tent);

            }
        });
        golpo8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                golpohead= getString(R.string.golpo8);
                golpobody="Once upon a time, in a cozy home on the outskirts of town, lived a dynamic duo—you and your beloved pet, a mischievous and furry friend named Whiskers. Whiskers, a fluffy tabby cat with a penchant for adventure, brought joy and laughter into every corner of your life.\n" +
                        "\n" +
                        "One sunny afternoon, as golden rays streamed through the windows, you decided to embark on a whimsical journey with Whiskers. The destination? The enchanted backyard, a place where ordinary moments transformed into extraordinary memories.\n" +
                        "\n" +
                        "Armed with a blanket and a basket of treats, you and Whiskers set out for the backyard paradise. The air was filled with the melody of birdsong, and the sun painted a warm canvas across the sky.\n" +
                        "\n" +
                        "As you laid out the blanket, Whiskers circled around, her tail flicking with excitement. The backyard, a realm of hidden wonders, became the stage for your impromptu picnic. Whiskers, with her keen senses, sniffed at the treats and playfully batted at the dangling basket strings.\n" +
                        "\n" +
                        "You opened the basket to reveal an assortment of delectable treats—a feast fit for both human and feline royalty. Whiskers, with her dainty manners, delicately nibbled on a catnip-flavored delicacy, while you savored sandwiches and enjoyed the simple pleasure of the sun's warm embrace.\n" +
                        "\n" +
                        "The afternoon unfolded into a series of playful escapades. Whiskers chased after butterflies, her fluffy tail a blur of excitement. You joined in the fun, creating a game of hide-and-seek among the blossoming flowers. Laughter echoed through the air as you and Whiskers reveled in the magic of shared moments.\n" +
                        "\n" +
                        "As the sun began its descent, casting a golden hue across the landscape, you and Whiskers nestled on the blanket, watching the world transition from day to night. The sky transformed into a canvas of pastel colors, and the first stars peeked through the twilight.\n" +
                        "\n" +
                        "With Whiskers curled up beside you, you gazed at the stars, sharing whispers of dreams and secrets. The backyard, once just a patch of grass, had become a sanctuary of connection and joy—a place where the bond between human and pet flourished.\n" +
                        "\n" +
                        "As the night sky embraced the world, you and Whiskers headed back inside, carrying the magic of the backyard with you. The memories of that enchanted afternoon lingered, etched into the fabric of your shared story. And so, in the heart of your cozy home, the adventures continued—a testament to the enduring bond between a pet and their loving companion.";
                Intent tent =new Intent(MainActivity.this,storytext.class);
                startActivity(tent);

            }
        });
        golpo9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                golpohead= getString(R.string.golpo9);
                golpobody="The first day at university was a whirlwind of emotions, a mixture of excitement, nervousness, and the overwhelming sense of embarking on a new chapter of life. Armed with a backpack full of notebooks, a shiny laptop, and a heart brimming with anticipation, I stepped onto the vibrant campus.\n" +
                        "\n" +
                        "The grounds buzzed with activity as students navigated their way through the maze of buildings, a sea of faces reflecting a myriad of emotions. I felt like a small fish in a big pond, but the atmosphere was charged with the promise of knowledge, growth, and endless possibilities.\n" +
                        "\n" +
                        "Navigating through the labyrinth of buildings, I found myself in a lecture hall filled with eager faces. The professor, with a welcoming smile, embarked on a journey to introduce us to the subject that would be our academic companion for the semester. The air was abuzz with the rustling of papers, the soft hum of laptops, and the occasional nervous laughter.\n" +
                        "\n" +
                        "During the break, I seized the opportunity to strike up conversations with my fellow students. Names, hometowns, and aspirations were exchanged in a rapid-fire manner, each interaction revealing the diverse tapestry of backgrounds that now formed our academic community. The nervousness began to dissipate as the realization dawned that we were all in this together—a cohort of individuals united by the pursuit of knowledge.\n" +
                        "\n" +
                        "As the day unfolded, I explored the campus, marveled at the towering library, and discovered the cozy corners where students gathered between classes. The university, once an abstract concept, began to feel like a second home.\n" +
                        "\n" +
                        "The highlight of the day was the inaugural assembly. The university's leaders welcomed us with inspiring speeches, emphasizing the transformative journey that awaited us. The campus echoed with applause and cheers, fostering a sense of camaraderie among the sea of faces that would become familiar over the coming years.\n" +
                        "\n" +
                        "By the time the day drew to a close, fatigue mingled with a profound sense of accomplishment. The first day had been a rollercoaster of emotions, but as I headed back to my dormitory, I couldn't help but feel a burgeoning excitement for the journey ahead—a journey that promised growth, learning, and the forging of lifelong friendships.\n" +
                        "\n" +
                        "As I lay in bed, surrounded by the unfamiliar sounds of dorm life, I reflected on the first day at university. It was a day of new beginnings, a day that marked the commencement of an adventure that would shape not just my academic pursuits but also my personal growth. The journey had just begun, and the canvas of university life awaited the brushstrokes of my experiences.";
                Intent tent =new Intent(MainActivity.this,storytext.class);
                startActivity(tent);

            }
        });

        golpo10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                golpohead= getString(R.string.golpo10);
                golpobody="On a sun-kissed morning, you and your dear friend Srity embarked on a spontaneous adventure to visit the sea. The excitement bubbled between you as you tossed a beach towel, sunscreen, and a well-worn map into the back of your trusty beach-bound vehicle.\n" +
                        "\n" +
                        "The journey was a harmonious blend of laughter and melodies as you shared favorite tunes on the road. The anticipation built with each passing mile, and the salty breeze carried whispers of the sea, enticing you both.\n" +
                        "\n" +
                        "As you approached the coastline, the rhythmic sound of crashing waves serenaded your arrival. The sea, vast and blue, stretched out before you, inviting you to immerse yourselves in its embrace. You and Srity couldn't help but let out a collective gasp, captivated by the beauty that unfolded.\n" +
                        "\n" +
                        "The day unfolded in a series of joyous escapades. You and Srity built sandcastles, your hands shaping turrets and moats with childlike delight. The waves played tag with your toes as you strolled along the shoreline, exchanging stories and dreams.\n" +
                        "\n" +
                        "A sudden burst of energy seized you both, and you decided to try your hand at surfing. Srity, initially hesitant, found courage in your shared enthusiasm. With surfboards in hand, you paddled out into the sea, riding waves and exchanging triumphant cheers with every successful ride.\n" +
                        "\n" +
                        "The sun began its descent, casting a warm glow across the horizon. You and Srity settled on the beach, the sand beneath you becoming a canvas for your shared memories. As the sky transformed into a tapestry of oranges and pinks, you exchanged heartfelt conversations, sharing dreams, fears, and the profound beauty of friendship.\n" +
                        "\n" +
                        "As the stars emerged in the velvet sky, you and Srity lit a bonfire, its crackling flames dancing to the rhythm of your laughter. Marshmallows found their way onto skewers, transforming into gooey, golden treats over the open flame. The sweet scent of toasted marshmallows mingled with the salty sea breeze, creating a sensory symphony that would forever be etched in your memories.\n" +
                        "\n" +
                        "Under the vast expanse of the night sky, you and Srity wrapped yourselves in blankets, gazing at the stars. The sea whispered tales of distant lands, and the rhythmic lullaby of the waves became a soothing backdrop to your shared silence.\n" +
                        "\n" +
                        "As the night unfolded its secrets, you and Srity realized that this spontaneous journey to the sea was not just a trip but a treasure trove of moments—a tapestry woven with laughter, shared dreams, and the enduring beauty of friendship. And so, in the quiet embrace of the sea, you and Srity discovered the magic that happens when two kindred spirits set out on an unplanned adventure together.";
                Intent tent =new Intent(MainActivity.this,storytext.class);
                startActivity(tent);

            }
        });























    }




    public void onBackPressed() {

        AlertDialog.Builder alertdoalog = new AlertDialog.Builder(MainActivity.this);


        alertdoalog.setTitle("Confirm Exit ");

        alertdoalog.setMessage("Do You Really Want to Exit ? ");
        alertdoalog.setIcon(R.drawable.salash);
        alertdoalog.setPositiveButton("YES", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                finishAffinity();
            }
        });
        alertdoalog.setNegativeButton("NO", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {

                dialog.dismiss();

            }
        });


        alertdoalog.show();


    }}