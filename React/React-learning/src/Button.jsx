function printHello(){
    console.log("Hello");
}

function Button(){
    return(
        <div>
            <button onClick={printHello}>Click</button>
        </div>
    )
}

export default Button;