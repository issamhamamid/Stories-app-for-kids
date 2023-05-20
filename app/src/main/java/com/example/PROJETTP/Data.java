package com.example.PROJETTP;

import java.util.ArrayList;
import java.util.List;

public class Data {


    public static List<StoryModel> storieslist = new ArrayList<StoryModel>();

    public static List<StoryModel> favoriteslist = new ArrayList<StoryModel>();




    static {
        storieslist.add(new StoryModel(
                R.drawable.avril, "Le premier avril",
                new Scene[] {
                        new Scene("test" , R.drawable.avril1),
                        new Scene("Je retrouve Papa et Maman au petit déjeuner en leur " +
                                "faisant un gros bisou, je leur colle discrètement un poisson " +
                                "chacun dans le dos.", R.drawable.avril2),

                        new Scene( "J'arrive à l'école et je décide de coller des poissons dans le " +
                                "dos de mes camarades de classe. " +
                                "Tout le monde rigole mais se demande qui est le gros " +
                                "farceur!", R.drawable.avril3),

                        new Scene("\"Dans la cours de récré tous les élèves ont des" +
                                " poissons dans le dos c'est tellement rigolo ! Mais" +
                                " je sens que beaucoup d'entre eux rigolent en me" +
                                " regardant. Ils ont sans doute compris que c'était " +
                                "moi ?\"", R.drawable.avril4)
                } , false
        ));




        storieslist.add(new StoryModel(R.drawable.loup , "Le loup et L'agneau" ,   new Scene[] {
                new Scene("\"La raison du plus fort est toujours la meilleure  , Nous l'allons montrer tout à l'heure.\"", R.drawable.loup1),

                new Scene("Un Agneau se désaltérait Dans le courant d'une onde pure.\n " +
                        "Un Loup survient à jeune qui cherchait aventure, Et que l" +
                        "a faim en ces lieux attirait.", R.drawable.loup2),
                new Scene(
                        "Qui te rend si hardi de troubler mon breuvage \n"
                        + "Dit cet animal plein de rage \n"
                        + "Tu seras châtié de ta témérité.", R.drawable.loup3),


                new Scene("- Sire, répond l'Agneau, que votre Majesté Ne se" +
                        " mette pas en colère; Mais plutôt qu'elle considère Que le me vas désaltérant" +
                        " Dans le courant, Plus de vingt pas au-dessous d'Elle, Et que par conséquent," +
                        " en aucune façon, Je ne puis troubler sa boisson.", R.drawable.loup4)

                ,
                new Scene("- Tu la troubles, reprit cette bête cruelle, Et je sais que de moi tu médis l'an passé. - Comment l'aurais-je fait si je n'étais pas né ? Reprit l'Agneau," +
                        " je tette encore ma mère. - Si ce n'est toi, c'est do" +
                        "nc ton frère. - Je n'en ai point. - C'est donc quel" +
                        "qu'un des tiens.", R.drawable.loup5)
                ,
                new Scene("Car vous ne m'épargnez guère, Vous, vos bergers, et vos chiens. On me l'a" +
                        " dit : il faut que je me venge. Là" +
                        "-dessus, au fond des forêts Le Loup l'e" +
                        "mporte, et puis le mange, Sans autre f" +
                        "orme de procès.", R.drawable.loup6)
        }, false
        ));

        storieslist.add(new StoryModel(R.drawable.pelican , "L’éléphant et le pélican" ,   new Scene[] {
                new Scene("Il était une fois, dans la jungle d'Afrique, un pélican qui traversait la jungle parce qu'il y avait beaucoup de nourriture là-bas. Quand il est arrivé, il a vu un éléphant se vanter de sa force. Il s'approcha de lui et lui dit : Mon ami, pourquoi te vantes-tu tant de ta force? Alors l'éléphant " +
                        "lui répondit : Eh bien, parce que je suis le meilleur de la " +
                        "jungle, tu ne vois pas ? Le pélican a demandé : Qu'est-ce que je suis censé voir?", R.drawable.pelican1),

                new Scene("L'éléphant lui dit : Eh bien, ma longue trompe, mes grosses jambes," +
                        " mes bras et ma grande agilité à mouiller les autres. Puis le pélican lu" +
                        "i a dit qu'il rivaliserait avec lui pour le nom du meilleur de la jungle. L'éléphant hocha " +
                        "la tête, car il" +
                        " pensait qu'il gagnerait.", R.drawable.pelican2),

                new Scene("Le toucan était l'arbitre, le premier tour était pour celui qui a atteint la ligne d'arrivée le premier" +
                        " à travers un endroit avec des plantes indestructibles" +
                        " dans lequel on ne pouvait même pas marcher. Ils ont commencé, " +
                        "et l'éléphant s'est emmêlé dans les plantes tandis que le " +
                        "pélican a commencé à voler et a atteint " +
                        "la ligne d'arrivée en premier.", R.drawable.pelican3),

                new Scene("Le deuxième tour consistait à mettre " +
                        "une pierre la plus petite à la rivière." +
                        " L'éléphant, déjà égratigné et blessé par les plantes a " +
                        "d'abord essayé de sucer le petit rocher mais comme " +
                        "il était si petit il a fini" +
                        " par se noyer. Puis le pélican" +
                        " l'a ramassé avec son" +
                        " bec très soigneusement pour ne pas l'avaler," +
                        " l'a emmené à la rivière puis l'a relâché.", R.drawable.pelican4) ,

                new Scene("Au troisième tour, le toucan (qui était l'arbitre) devait être mouillé." +
                        " D'abord, comme toujours, c'était l'éléphant, faible, blessé et sur le point" +
                        " de tomber, l'éléphant a pris de l'eau avec sa trompe et a visé le toucan mais" +
                        " il était tellement étourdi, il a heurté une plante géante qui " +
                        "est tombée sur lui. " +
                        "Le pélican a été déclaré" +
                        " le meilleur de la jungle et tout le monde était heureux que cet éléphant prétentieux soit parti.", R.drawable.pelican5)
        }, false
        ));


        storieslist.add(new StoryModel(R.drawable.tango , "À la recherche de tango" ,   new Scene[] {
                new Scene("A cat is sitting on a windowsill", R.drawable.avril1),
                new Scene("A group of friends are having a picnic in the park", R.drawable.avril2),
                new Scene("A hiker is standing on top of a mountain", R.drawable.avril3),
                new Scene("A couple is dancing in a ballroom", R.drawable.avril4)
        }, false
        ));
        storieslist.add(new StoryModel(R.drawable.bol , "Bol de fer et bol de ver" ,   new Scene[] {
                new Scene("A cat is sitting on a windowsill", R.drawable.avril1),
                new Scene("A group of friends are having a picnic in the park", R.drawable.avril2),
                new Scene("A hiker is standing on top of a mountain", R.drawable.avril3),
                new Scene("A couple is dancing in a ballroom", R.drawable.avril4)
        }, false
        ));

        storieslist.add(new StoryModel(R.drawable.loup , "Le loup et L'agneau" ,   new Scene[] {
                new Scene("A cat is sitting on a windowsill", R.drawable.avril1),
                new Scene("A group of friends are having a picnic in the park", R.drawable.avril2),
                new Scene("A hiker is standing on top of a mountain", R.drawable.avril3),
                new Scene("A couple is dancing in a ballroom", R.drawable.avril4)
        }, false
        ));

        storieslist.add(new StoryModel(R.drawable.loup , "Le loup et L'agneau",   new Scene[] {
                new Scene("A cat is sitting on a windowsill", R.drawable.avril1),
                new Scene("A group of friends are having a picnic in the park", R.drawable.avril2),
                new Scene("A hiker is standing on top of a mountain", R.drawable.avril3),
                new Scene("A couple is dancing in a ballroom", R.drawable.avril4)
        }, false
        ));

        storieslist.add(new StoryModel(R.drawable.loup , "Le loup et L'agneau"  ,   new Scene[] {
                new Scene("A cat is sitting on a windowsill", R.drawable.avril1),
                new Scene("A group of friends are having a picnic in the park", R.drawable.avril2),
                new Scene("A hiker is standing on top of a mountain", R.drawable.avril3),
                new Scene("A couple is dancing in a ballroom", R.drawable.avril4)
        }, false
        ));

        storieslist.add(new StoryModel(R.drawable.loup , "Le loup et L'agneau" ,  new Scene[] {
                new Scene("A cat is sitting on a windowsill", R.drawable.avril1),
                new Scene("A group of friends are having a picnic in the park", R.drawable.avril2),
                new Scene("A hiker is standing on top of a mountain", R.drawable.avril3),
                new Scene("A couple is dancing in a ballroom", R.drawable.avril4)
        }, false
        ));

        storieslist.add(new StoryModel(R.drawable.loup , "Le loup et L'agneau" ,   new Scene[] {
                new Scene("A cat is sitting on a windowsill", R.drawable.avril1),
                new Scene("A group of friends are having a picnic in the park", R.drawable.avril2),
                new Scene("A hiker is standing on top of a mountain", R.drawable.avril3),
                new Scene("A couple is dancing in a ballroom", R.drawable.avril4)
        }, false
        ));



    }


        static {
            favoriteslist.add(new StoryModel(
                    R.drawable.avril, "Le premier avril",
                    new Scene[] {
                            new Scene("Aujourd'hui c'est le 1er avril! J'ai préparé plein de  poissons" +
                                    " en papier pour les coller dans le dos de ma famille et de " +
                                    "mes amis." , R.drawable.avril1),
                            new Scene("Je retrouve Papa et Maman au petit déjeuner en leur " +
                                    "faisant un gros bisou, je leur colle discrètement un poisson " +
                                    "chacun dans le dos.", R.drawable.avril2),

                            new Scene( "J'arrive à l'école et je décide de coller des poissons dans le " +
                                    "dos de mes camarades de classe. " +
                                    "Tout le monde rigole mais se demande qui est le gros " +
                                    "farceur!", R.drawable.avril3),

                            new Scene("\"Dans la cours de récré tous les élèves ont des" +
                                    " poissons dans le dos c'est tellement rigolo ! Mais" +
                                    " je sens que beaucoup d'entre eux rigolent en me" +
                                    " regardant. Ils ont sans doute compris que c'était " +
                                    "moi ?\"", R.drawable.avril4)
                    }, false
            ));
    }
}
