import { useState } from "react";

export default function Counter(){
    let [count, setCount] = useState(0);

    function counter(){
        setCount(count++)
    }   
    return(
        <>
        <button onClick = {counter}>Count {count}</button>
        </>
    )
}