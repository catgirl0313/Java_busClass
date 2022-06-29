
    class Bus{
        //필드
        int maxPassenger = 30;// 최대 승객수
        int currentPassenger = 0; // 현재 승객수
        int busFair = 1200; // 버스 요금
        int busNumber; // 버스 번호
        int fuelVolume; // 주유량
        int currentSpeed; // 현재 속도
        int accelOrBreak; //속도 변경
        String status = "운행"; // 최초 버스 상태 == "운행"

    //생성자
    Bus() {
        this.busNumber = (int)(Math.random()* 1000);
        System.out.println(busNumber); //버스번호 랜덤 생성성
    }
    //연료가 10이상일때 운행 가능
   boolean leftFuel(){
        return fuelVolume >= 10;
    }
    //운행 상태 변경
    boolean isRunning() {
        if(!status.equals("운행")){  //운행 종료 시 차고지행
            status = "차고지행";
        }

        if(leftFuel()) {    //주유량 10이상으로 운행가능 상태라면 연료량 체크,
            System.out.println("--운행중--기름이" +fuelVolume + "남았습니다." );
            fuelVolume = fuelVolume -1;    // 주유량 떨어짐: 근데 왜 -1 로 감소됨..? 그냥 감소되는 자체를 표현한건가.
            return true;
        }
        if(!leftFuel()) {   //주유량이 떨어지면 차고지행
            System.out.println("주유가 필요합니다.");  //주유량 10 미만이라면, 주유 필요 메세지 출력
            status = "차고지행";
        }
        return true;

    }

    //승객탑승
     boolean boardable() {
        return maxPassenger >= currentPassenger;
    }

    int onBoard(int passenger) {
        currentPassenger += passenger;
        while(boardable()){
            if (status.equals("운행")) {
                System.out.println("승객" + passenger + "명 탑승," + " 현재 승객수 :" + currentPassenger + "명");
            }
            break;
        }
        if(!boardable()) {
            System.out.println(currentPassenger - maxPassenger + "명 초과, 탑승불가.");
        }
        return currentPassenger;

    }

    //속도 변경
    int changeSpeed(int accelOrBreak){
        this.accelOrBreak = accelOrBreak;
        currentSpeed = 10;

        if(leftFuel()) {
            currentSpeed += accelOrBreak;
        }
        System.out.println("현재 속도 : " + currentSpeed + "km/hr");
        return currentSpeed;
    }

    //








}
