package com.example.nozimy.task1;

import java.util.ArrayList;
import java.util.HashMap;


public class MockDataHelper {

    static ArrayList<Image> images = new ArrayList<Image>();

    public static ArrayList<Image> getImages() {

        if (images.size() == 0) {
            int defaultImg = R.drawable.photo;

            images.add(new Image("http://en.bcdn.biz/Images/2016/10/12/80497d49-e5f8-4595-aa86-a546a5d2fc15.jpg", "Ball lightning", "Description", defaultImg));
            images.add(new Image("http://en.bcdn.biz/Images/2016/10/12/f6c576d4-9197-47e2-b65f-e7741e588681.jpg", "Amigos", "Description", defaultImg));
            images.add(new Image("http://en.bcdn.biz/Images/2016/10/12/e0f5813b-d81d-4d43-8f9f-f917c1bab75a.jpg", "The golden cliffs of the Sinyaya River", "Description", defaultImg));
//            images.add(new Image("http://en.bcdn.biz/Images/2016/10/12/dde9811b-b374-4f67-b4dd-ee5da51736ff.jpg", "You can almost touch it...", "Description", defaultImg));
//            images.add(new Image("http://en.bcdn.biz/Images/2016/10/12/950c4068-0813-4971-aece-ee1e1173b45f.jpg", "Insects are heating up the stove downstairs...", "Description", defaultImg));
//            images.add(new Image("http://en.bcdn.biz/Images/2016/10/12/ac93de02-a113-47e7-ab6c-2c18129c08e0.jpg", "Have you ever seen a hedgehog’s heel?", "Description", defaultImg));
//            images.add(new Image("http://en.bcdn.biz/Images/2016/10/12/4665d397-748a-41df-b8ff-65aac8eaef5b.jpg", "Light and darkness", "Description", defaultImg));
//            images.add(new Image("http://en.bcdn.biz/Images/2016/10/12/2a557230-6fde-49bc-98b1-04af12e25d01.jpg", "A pasture for three", "Description", defaultImg));
//            images.add(new Image("http://en.bcdn.biz/Images/2016/10/12/994d18f2-4b62-4cab-ac90-110f199d469a.jpg", "Dancing", "Description", defaultImg));
//            images.add(new Image("http://en.bcdn.biz/Images/2016/10/12/f7cbddc7-998d-4d36-8fb1-44de83d0eb0f.jpg", "Droplets of pure beauty", "Description", defaultImg));
//            images.add(new Image("http://en.bcdn.biz/Images/2016/10/12/c906cae8-3cb9-4315-b7ab-652f85cde045.jpg", "Black and white", "Description", defaultImg));
//            images.add(new Image("http://en.bcdn.biz/Images/2016/10/12/3970fb65-7a10-4f9d-8978-8af090d6bc65.jpg", "The unity of opposites", "Description", defaultImg));
//            images.add(new Image("http://en.bcdn.biz/Images/2016/10/12/c397cf9b-fa8b-4a06-9e11-1bab03ea1179.jpg", "Fraternal love", "Description", defaultImg));
//            images.add(new Image("http://en.bcdn.biz/Images/2016/10/12/fa0e865f-582c-4d8c-a396-104893633148.jpg", "Flight", "Description", defaultImg));
//            images.add(new Image("http://en.bcdn.biz/Images/2016/10/12/80a8b9d1-c7f8-4a51-b663-f8ad38929231.jpg", "At the edge of the world", "Description", defaultImg));
//            images.add(new Image("http://rcysl.com/wp-content/uploads/2017/02/Amazing-Nature-Pics-.jpg", "Amazing Nature Pics", "Description", defaultImg));
//            images.add(new Image("http://rcysl.com/wp-content/uploads/2017/02/Awesome-Beautiful-Nature-Pics-.jpg", "Awesome Beautiful Nature Pics", "Description", defaultImg));
//            images.add(new Image("http://rcysl.com/wp-content/uploads/2017/02/Nature-Pics-4K-Pack.jpg", "Nature Pics 4K Pack", "Description", defaultImg));
//            images.add(new Image("http://rcysl.com/wp-content/uploads/2017/02/Nature-Pics-Free-Download.jpg", "Trees", "Description", defaultImg));
//            images.add(new Image("http://rcysl.com/wp-content/uploads/2017/02/Nature-Pics-In-Best-Resolutions.jpg", "Yellow Field", "Description", defaultImg));
//            images.add(new Image("http://rcysl.com/wp-content/uploads/2017/02/Nature-Pics-Photo-Collection.jpg", "Nature Pics Photo Collection\n", "Description", defaultImg));
//            images.add(new Image("http://rcysl.com/wp-content/uploads/2017/02/Nature-Pics-Photos.jpg", "Diff", "Description", defaultImg));
        }


        return images;
    }
}
