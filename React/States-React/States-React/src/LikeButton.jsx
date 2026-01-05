import {use, useState} from 'react';

function likeButton(){
    let [clicked , setClicked] = useState(false);

    function isClicked(){
        let newVal = !clicked;
       setClicked(!clicked);
    }
    return(
        <>
        <p onClick={isClicked} >
            { clicked ? (
                <i className="fa-regular fa-heart"></i>
            ) : (<i className="fa-solid fa-heart"></i>
            )} 
        </p>
        </>
    )
}

export default likeButton;