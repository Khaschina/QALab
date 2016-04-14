package com.Ekhaschina;



import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class Workers implements CompanysWorker {

    static Map<CompanysWorker,Integer> workers = new HashMap<>(Workers.workersNumber ());
    static Map<CompanysWorker,Integer> cleaner = new HashMap<>(Workers.workersNumber ());

    public static int project;

    public static int randomNumberForWorkers()
    {
        int rnd2 = (int) (Math.random () * ((7)));
        return rnd2;
    }


	public static int workersNumber()
	{
		int rnd3 = 10 *(int) (Math.random () * ((97 - 10)+10));
		return rnd3;
	}


	public static Map<CompanysWorker,Integer> createdWorkers(Map<CompanysWorker,Integer> workers,int projects)
	{
        workers.put(new Director(),projects);
        workers.put(new Manager(),projects);
        workers.put(new Accountant(),projects);

        for(int i = 0;i <Workers.workersNumber () + 3;i++)
        {

            if (randomNumberForWorkers() == 0) {
                 workers.put(new Developer (),projects);
            }
            else if(randomNumberForWorkers () == 1)
            {
                workers.put(new Tester (),projects);
            }
            else if(randomNumberForWorkers() == 2)
            {
                workers.put(new Designer(),projects);
            }
            else if(randomNumberForWorkers() == 7)
            {
                cleaner.put(new com.Ekhaschina.Cleaner(),projects);
            }

        }
        return workers;

	}
    public static void lookingForMyMap(Map<CompanysWorker,Integer> workers)
    {

        for (Map.Entry<CompanysWorker, Integer> pair : workers.entrySet()) {

            CompanysWorker key = pair.getKey();
            Integer value = pair.getValue();
            System.out.println(key + ":" + value);
        }
    }


    public static void main(String[] args) {

        createdWorkers(workers,project);
        lookingForMyMap(workers);
    }
}
