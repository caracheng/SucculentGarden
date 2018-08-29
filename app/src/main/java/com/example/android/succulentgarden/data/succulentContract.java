package com.example.android.succulentgarden.data;

import android.provider.BaseColumns;

public final class succulentContract {

    private succulentContract(){}

    public static abstract class succulentEntry implements BaseColumns{
        public final static String TABLE_NAME = "succulents";
        public final static String _ID = BaseColumns._ID;
        public final static String COLUMN_COMMON_NAME = "commonName";
        public final static String COLUMN_SCIENTIFIC_NAME = "scientificName";
        public final static String COLUMN_GROWTH_TYPE = "growthType";
        public final static String COLUMN_SUN = "sun";
        public final static String COLUMN_ZONE = "zone";

        public static final int full_sun = 0;
        public static final int full_sun_to_partial_sun = 1;
        public static final int partial_sun = 2;
        public static final int full_sun_to_partial_shade = 3;
        public static final int partial_shade = 4;
        public static final int partial_sun_to_partial_shade = 5;
        public static final int full_shade = 5;
        public static final int partial_shade_to_full_shade = 6;
        public static final int partial_sun_to_full_shade = 7;

        public static final int outdoor_only = 8;
        public static final int indoors_okay_with_enough_sun = 9;
        public static final int indoors_well_with_bright_light = 10;
    }
}
