package com.example.administrator.lianxi.bean;
import java.util.List;
/**
 * date:${DATA}
 * author:孟淑英
 * function:
 */
public class JsonBean {
    /**
     * list : [{"id":227,"site_name":"沈巷五显街道（自助）","address":"安徽省芜湖市沈巷五显养老中心附近","lat":31.50808,"lng":118.250114,"merchantId":1,"isNightReturnCar":0,"isNightGetCar":0,"startTimeForWork":"07:00","endTimeForWork":"18:30","allow":0,"distance":966490,"useable":2,"chargeNum":0,"parkingNum":0},{"id":287,"site_name":"沈巷汽车站（自助）","address":"安徽省芜湖市安康路沈巷汽车站","lat":31.474491,"lng":118.24012,"merchantId":1,"isNightReturnCar":0,"isNightGetCar":0,"startTimeForWork":"07:00","endTimeForWork":"18:30","allow":0,"distance":970011,"useable":4,"chargeNum":0,"parkingNum":0},{"id":225,"site_name":"沈巷社区（自助）","address":"安徽省芜湖市人民大道与沈百南路交叉附近","lat":31.471472,"lng":118.23079,"merchantId":1,"isNightReturnCar":0,"isNightGetCar":0,"startTimeForWork":"07:00","endTimeForWork":"18:30","allow":0,"distance":970191,"useable":3,"chargeNum":0,"parkingNum":0},{"id":269,"site_name":"三安光电(自助)","address":"安徽省芜湖市东梁路三安光电","lat":31.499424,"lng":118.41365,"merchantId":1,"isNightReturnCar":1,"isNightGetCar":1,"startTimeForWork":"00:00","endTimeForWork":"23:59","allow":1,"distance":970215,"useable":2,"chargeNum":0,"parkingNum":0},{"id":224,"site_name":"沈巷镇政府（自助）","address":"安徽省芜湖市人民大道沈巷镇政府","lat":31.470589,"lng":118.23775,"merchantId":1,"isNightReturnCar":0,"isNightGetCar":0,"startTimeForWork":"07:00","endTimeForWork":"18:30","allow":0,"distance":970401,"useable":1,"chargeNum":0,"parkingNum":0},{"id":273,"site_name":"沈巷交警中队（自助）","address":"安徽省芜湖市香缘路沈巷交警中队","lat":31.466871,"lng":118.23594,"merchantId":1,"isNightReturnCar":0,"isNightGetCar":0,"startTimeForWork":"07:00","endTimeForWork":"18:30","allow":0,"distance":970779,"useable":2,"chargeNum":0,"parkingNum":0},{"id":235,"site_name":"奇瑞BOBO城（自助）","address":"安徽省芜湖市泰山路奇瑞BOBO城(东北角)","lat":31.471392,"lng":118.407616,"merchantId":1,"isNightReturnCar":0,"isNightGetCar":0,"startTimeForWork":"07:00","endTimeForWork":"18:30","allow":0,"distance":973175,"useable":7,"chargeNum":0,"parkingNum":0},{"id":234,"site_name":"奇瑞新里城（自助）","address":"安徽省芜湖市泰山路奇瑞新里城小区","lat":31.468853,"lng":118.39817,"merchantId":1,"isNightReturnCar":1,"isNightGetCar":1,"startTimeForWork":"00:00","endTimeForWork":"23:59","allow":1,"distance":973288,"useable":8,"chargeNum":0,"parkingNum":0},{"id":190,"site_name":"大桥新城商业街（自助）","address":"安徽省芜湖市九华北路大桥新城附近","lat":31.470703,"lng":118.41558,"merchantId":1,"isNightReturnCar":0,"isNightGetCar":0,"startTimeForWork":"07:00","endTimeForWork":"18:30","allow":0,"distance":973391,"useable":4,"chargeNum":0,"parkingNum":0},{"id":105,"site_name":"宜居蓝鲸湾（自助）","address":"安徽省芜湖市鸠江区泰山路宜居蓝鲸湾小区","lat":31.461918,"lng":118.40571,"merchantId":1,"isNightReturnCar":0,"isNightGetCar":0,"startTimeForWork":"07:00","endTimeForWork":"18:30","allow":0,"distance":974178,"useable":8,"chargeNum":0,"parkingNum":0},{"id":194,"site_name":"汽车电子及关键零部件创业园（自助）","address":"安徽省芜湖市衡山路汽车电子及关键零部件创业园","lat":31.458141,"lng":118.39601,"merchantId":1,"isNightReturnCar":1,"isNightGetCar":1,"startTimeForWork":"00:00","endTimeForWork":"23:59","allow":1,"distance":974422,"useable":10,"chargeNum":0,"parkingNum":0},{"id":175,"site_name":"益安小区（自助）","address":"安徽省芜湖市银湖北路上闸社区公共服务中心附近","lat":31.447845,"lng":118.375984,"merchantId":1,"isNightReturnCar":1,"isNightGetCar":1,"startTimeForWork":"00:00","endTimeForWork":"23:59","allow":1,"distance":975202,"useable":6,"chargeNum":0,"parkingNum":0}]
     * msg : {"info":"sign签名验证成功.","code":0,"success":true}
     */
    private MsgBean msg;
    private List<ListBean> list;

    public MsgBean getMsg() {
        return msg;
    }

    public void setMsg(MsgBean msg) {
        this.msg = msg;
    }

    public List<ListBean> getList() {
        return list;
    }

    public void setList(List<ListBean> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "JsonBean{" +
                "msg=" + msg +
                ", list=" + list +
                '}';
    }

    public static class MsgBean {
        /**
         * info : sign签名验证成功.
         * code : 0
         * success : true
         */

        private String info;
        private int code;
        private boolean success;

        public String getInfo() {
            return info;
        }

        public void setInfo(String info) {
            this.info = info;
        }

        public int getCode() {
            return code;
        }

        public void setCode(int code) {
            this.code = code;
        }

        public boolean isSuccess() {
            return success;
        }

        public void setSuccess(boolean success) {
            this.success = success;
        }

        @Override
        public String toString() {
            return "MsgBean{" +
                    "info='" + info + '\'' +
                    ", code=" + code +
                    ", success=" + success +
                    '}';
        }
    }

    public static class ListBean {
        /**
         * id : 227
         * site_name : 沈巷五显街道（自助）
         * address : 安徽省芜湖市沈巷五显养老中心附近
         * lat : 31.50808
         * lng : 118.250114
         * merchantId : 1
         * isNightReturnCar : 0
         * isNightGetCar : 0
         * startTimeForWork : 07:00
         * endTimeForWork : 18:30
         * allow : 0
         * distance : 966490
         * useable : 2
         * chargeNum : 0
         * parkingNum : 0
         */

        private int id;
        private String site_name;
        private String address;
        private double lat;
        private double lng;
        private int merchantId;
        private int isNightReturnCar;
        private int isNightGetCar;
        private String startTimeForWork;
        private String endTimeForWork;
        private int allow;
        private int distance;
        private int useable;
        private int chargeNum;
        private int parkingNum;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getSite_name() {
            return site_name;
        }

        public void setSite_name(String site_name) {
            this.site_name = site_name;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public double getLat() {
            return lat;
        }

        public void setLat(double lat) {
            this.lat = lat;
        }

        public double getLng() {
            return lng;
        }

        public void setLng(double lng) {
            this.lng = lng;
        }

        public int getMerchantId() {
            return merchantId;
        }

        public void setMerchantId(int merchantId) {
            this.merchantId = merchantId;
        }

        public int getIsNightReturnCar() {
            return isNightReturnCar;
        }

        public void setIsNightReturnCar(int isNightReturnCar) {
            this.isNightReturnCar = isNightReturnCar;
        }

        public int getIsNightGetCar() {
            return isNightGetCar;
        }

        public void setIsNightGetCar(int isNightGetCar) {
            this.isNightGetCar = isNightGetCar;
        }

        public String getStartTimeForWork() {
            return startTimeForWork;
        }

        public void setStartTimeForWork(String startTimeForWork) {
            this.startTimeForWork = startTimeForWork;
        }

        public String getEndTimeForWork() {
            return endTimeForWork;
        }

        public void setEndTimeForWork(String endTimeForWork) {
            this.endTimeForWork = endTimeForWork;
        }

        public int getAllow() {
            return allow;
        }

        public void setAllow(int allow) {
            this.allow = allow;
        }

        public int getDistance() {
            return distance;
        }

        public void setDistance(int distance) {
            this.distance = distance;
        }

        public int getUseable() {
            return useable;
        }

        public void setUseable(int useable) {
            this.useable = useable;
        }

        public int getChargeNum() {
            return chargeNum;
        }

        public void setChargeNum(int chargeNum) {
            this.chargeNum = chargeNum;
        }

        public int getParkingNum() {
            return parkingNum;
        }

        public void setParkingNum(int parkingNum) {
            this.parkingNum = parkingNum;
        }

        @Override
        public String toString() {
            return "ListBean{" +
                    "id=" + id +
                    ", site_name='" + site_name + '\'' +
                    ", address='" + address + '\'' +
                    ", lat=" + lat +
                    ", lng=" + lng +
                    ", merchantId=" + merchantId +
                    ", isNightReturnCar=" + isNightReturnCar +
                    ", isNightGetCar=" + isNightGetCar +
                    ", startTimeForWork='" + startTimeForWork + '\'' +
                    ", endTimeForWork='" + endTimeForWork + '\'' +
                    ", allow=" + allow +
                    ", distance=" + distance +
                    ", useable=" + useable +
                    ", chargeNum=" + chargeNum +
                    ", parkingNum=" + parkingNum +
                    '}';
        }
    }
}
