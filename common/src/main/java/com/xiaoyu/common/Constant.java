package com.xiaoyu.common;

import java.util.ArrayList;
import java.util.List;

/**
 * @author shkstart@create 2019-09-22 20:55
 */
public class Constant {


    public static class Gender{

        //男
        public static final int BOY = 1;

        //女
        public static final int GIRL = 2;

        public static final String getName( int type ) {
            String returnName = "";
            switch( type ) {
                case BOY:
                    returnName = "男";
                    break;
                case GIRL:
                    returnName = "女";
                    break;
                default:break;
            }
            return returnName;
        }

        public static List<ComboEntity> getList() {

            List<ComboEntity> list = new ArrayList<>();
            list.add( new ComboEntity( getName( BOY ), String.valueOf( BOY ) ) );//男 ，1
            list.add( new ComboEntity( getName( GIRL ), String.valueOf( GIRL ) ) );//女，2
            return list;
        }

    }

}
