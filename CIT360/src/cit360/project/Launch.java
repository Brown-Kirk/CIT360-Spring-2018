/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit360.project;

import java.util.List;

/**
 *
 * @author Kirk Brown
 */

public class Launch {
    private List<launches> launches;
    private int total;
    private String offset;
    private int count;

    public Launch() {
        super();
    }

    public int gettotal() {
        return total;
    }

    public void settotal(int total) {
        this.total = total;
    }

    public String getoffset() {
        return offset;
    }

    public void setoffset(String offset) {
        this.offset = offset;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public List<launches> getlaunches() {
        return this.launches;
    }

    public void setlaunches(List<launches> launches) {
        this.launches = launches;
    }

    public static class launches {
        private int id;
        private String name;
        private int status;
        private int tbdtime;
        private String vidurls;
        private String vidurl;
        private int tbddate;
        private int probability;
        private List<missions> missions;
        private String net;
        
        public int id() {
            return id;
        }
        public launches() {
            super();
        }
        public void setid(int id) {
            this.id = id;
        }
        public String getname() {
            return name;
        }
        public void setname(String name) {
            this.name = name;
        }
        public int getstatus() {
            return status;
        }
        public void setstatus(int status) {
            this.status = status;
        }
        public int gettbdtime() {
            return tbdtime;
        }
        public void settbdtime(int tbdtime) {
            this.tbdtime = tbdtime;
        }
        public String getvidurls() {
            return vidurls;
        }
        public void setvidurls(String vidurls) {
            this.vidurls = vidurls;
        }
        public String getvidurl() {
            return vidurl;
        }
        public void setvidurl(String vidurl) {
            this.vidurl = vidurl;
        }
        public int gettbddate() {
            return tbddate;
        }
        public void settbddate(int tbddate) {
            this.tbddate = tbddate;
        }
        public int getprobability() {
            return probability;
        }
        public void setprobability(int probability) {
            this.probability = probability;
        }
        public String getnet() {
            return net;
        }
        public void setnet(String net) {
            this.net = net;
        }

        public List<missions> getmissions() {
            return this.missions;
        }
        public void setmissions(List<missions> missions) {
            this.missions = missions;
        }
        public static class missions {
            private String description;
            
            public missions() {
                super();
            }
            public String description() {
               return description;
            }
            public String getdescription() {
                return description;
            }
            public void setdescription(String description) {
                this.description = description;
            }
       }
   }
    
}
